/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package toutiao.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=485453&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D47%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 根据项目，问基础问题：SQS如何消费Message的；
 * Docker如何实现资源隔离；
 * Hbase写入数据时候是怎么保存数据的；
 * 什么是LSM树；
 * synchronize 和 lock 有什么区别；
 * HashMap原理
 */

public class problem7 {
    /**
     * HashMap原理
     *
     * https://yikun.github.io/2015/04/01/Java-HashMap%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E5%8F%8A%E5%AE%9E%E7%8E%B0/
     *
     * Hash table based implementation of the Map interface.
     * This implementation provides all of the optional map operations,
     * and permits null values and the null key.
     * (The HashMap class is roughly equivalent to Hashtable,
     * except that it is unsynchronized and permits nulls.)
     *
     * This class makes no guarantees as to the order of the map;
     * in particular, it does not guarantee that the order will remain constant over time.
     *
     *
     * 在HashMap中有两个很重要的参数，容量(Capacity)和负载因子(Load factor)
     * Initial capacity The capacity is the number of buckets in the hash table,
     * The initial capacity is simply the capacity at the time the hash table is created.
     * Load factor The load factor is a measure of how full the hash table is
     * allowed to get before its capacity is automatically increased.
     * 简单的说，Capacity就是buckets的数目，Load factor就是buckets填满程度的最大比例。
     * 如果对迭代性能要求很高的话不要把capacity设置过大，也不要把load factor设置过小。
     * 当bucket填充的数目（即hashmap中元素的个数）大于capacity*load factor时就需要调整buckets的数目为当前的2倍。
     *
     *
     *
     * put函数大致的思路为：
     * 对key的hashCode()做hash，然后再计算index;
     * 如果没碰撞直接放到bucket里；
     * 如果碰撞了，以链表的形式存在buckets后；
     * 如果碰撞导致链表过长(大于等于TREEIFY_THRESHOLD)，就把链表转换成红黑树；
     * 如果节点已经存在就替换old value(保证key的唯一性)
     * 如果bucket满了(超过load factor*current capacity)，就要resize。
     *
     *
     *
     * 在理解了put之后，get就很简单了。大致思路如下：
     * bucket里的第一个节点，直接命中；
     * 如果有冲突，则通过key.equals(k)去查找对应的entry
     * 若为树，则在树中通过key.equals(k)查找，O(logn)；
     * 若为链表，则在链表中通过key.equals(k)查找，O(n)。
     *
     *
     *
     * */

    /**
     * synchronize 和 lock 有什么区别；
     *
     * https://blog.csdn.net/u012403290/article/details/64910926
     *
     *
     * 在开始之前先把进程与线程进行区分一下，一个程序最少需要一个进程，
     * 而一个进程最少需要一个线程。关系是线程–>进程–>程序的大致组成结构。
     * 所以线程是程序执行流的最小单位，而进程是系统进行资源分配和调度的一个独立单位。
     * 以下我们所有讨论的都是建立在线程基础之上。
     *
     *
     * 我们先了解一下Thread的几个重要方法。a、start()方法，调用该方法开始执行该线程；
     * b、stop()方法，调用该方法强制结束该线程执行；
     * c、join方法，调用该方法等待该线程结束。
     * d、sleep()方法，调用该方法该线程进入等待。
     * e、run()方法，调用该方法直接执行线程的run()方法，
     * 但是线程调用start()方法时也会运行run()方法，
     * 区别就是一个是由线程调度运行run()方法，一个是直接调用了线程中的run()方法！！
     *
     *
     * 看到这里，可能有些人就会问啦，那wait()和notify()呢？要注意，
     * 其实wait()与notify()方法是Object的方法，不是Thread的方法！！
     * 同时，wait()与notify()会配合使用，分别表示线程挂起和线程恢复。
     * 这里还有一个很常见的问题，顺带提一下：wait()与sleep()的区别，
     * 简单来说wait()会释放对象锁而sleep()不会释放对象锁。这些问题有很多的资料，不再赘述。
     *
     *
     * 线程总共有5大状态，通过上面第二个知识点的介绍，理解起来就简单了。
     * 新建状态：新建线程对象，并没有调用start()方法之前
     * 就绪状态：调用start()方法之后线程就进入就绪状态，但是并不是说只要调用start()方法线程就马上变为当前线程，在变为当前线程之前都是为就绪状态。值得一提的是，线程在睡眠和挂起中恢复的时候也会进入就绪状态哦。
     * 运行状态：线程被设置为当前线程，开始执行run()方法。就是线程进入运行状态
     * 阻塞状态：线程被暂停，比如说调用sleep()方法后线程就进入阻塞状态
     * 死亡状态：线程执行结束
     *
     * 可重入锁：在执行对象中所有同步方法不用再次获得锁
     * 可中断锁：在等待获取锁过程中可中断
     * 公平锁： 按等待获取锁的线程的等待时间进行获取，等待时间长的具有优先获取锁权利
     * 读写锁：对资源读取和写入的时候拆分为2部分处理，读的时候可以多线程一起读，写的时候必须同步地写
     *
     *
     * lock()：获取锁，如果锁被暂用则一直等待
     * unlock():释放锁
     * tryLock(): 注意返回类型是boolean，如果获取锁的时候锁被占用就返回false，否则返回true
     * tryLock(long time, TimeUnit unit)：比起tryLock()就是给了一个时间期限，保证等待参数时间
     * lockInterruptibly()：用该锁的获得方式，如果线程在获取锁的阶段进入了等待，那么可以中断此线程，先去做别的事
     *
     * 下面是Lock一般使用的例子，注意ReentrantLock是Lock接口的实现。
     *
     *
     * 1、两种锁的底层实现方式：
     * synchronized：我们知道java是用字节码指令来控制程序（这里不包括热点代码编译成机器码）。
     * 在字节指令中，存在有synchronized所包含的代码块，那么会形成2段流程的执行。
     *
     * 如上就是这段代码段字节码指令，没你想的那么难吧。言归正传，我们可以清晰段看到，
     * 其实synchronized映射成字节码指令就是增加来两个指令：monitorenter和monitorexit。
     * 当一条线程进行执行的遇到monitorenter指令的时候，它会去尝试获得锁，
     * 如果获得锁那么锁计数+1（为什么会加一呢，因为它是一个可重入锁，
     * 所以需要用这个锁计数判断锁的情况），如果没有获得锁，那么阻塞。
     * 当它遇到monitorexit的时候，锁计数器-1，当计数器为0，那么就释放锁。
     *
     * Lock：Lock实现和synchronized不一样，后者是一种悲观锁，它胆子很小，它很怕有人和它抢吃的，
     * 所以它每次吃东西前都把自己关起来。而Lock呢底层其实是CAS乐观锁的体现，
     * 它无所谓，别人抢了它吃的，它重新去拿吃的就好啦，所以它很乐观。
     * 具体底层怎么实现，博主不在细述，有机会的话，
     * 我会对concurrent包下面的机制好好和大家说说，如果面试问起，
     * 你就说底层主要靠volatile和CAS操作实现的。
     *
     *
     * https://www.cnblogs.com/Mainz/p/3546347.html
     *
     *
     * 独占锁是一种悲观锁，synchronized就是一种独占锁，它假设最坏的情况，
     * 并且只有在确保其它线程不会造成干扰的情况下执行，会导致其它所有需要锁的线程挂起，
     * 等待持有锁的线程释放锁。而另一个更加有效的锁就是乐观锁。
     * 所谓乐观锁就是，每次不加锁而是假设没有冲突而去完成某项操作，
     * 如果因为冲突失败就重试，直到成功为止。
     *
     *
     * 与锁相比，volatile变量是一和更轻量级的同步机制，
     * 因为在使用这些变量时不会发生上下文切换和线程调度等操作，
     * 但是volatile变量也存在一些局限：不能用于构建原子的复合操作，
     * 因此当一个变量依赖旧值时就不能使用volatile变量。
     *
     *
     * 原子操作指的是在一步之内就完成而且不能被中断。原子操作在多线程环境中是线程安全的，
     * 无需考虑同步的问题。在java中，下列操作是原子操作：
     * all assignments of primitive types except for long and double
     * all assignments of references
     * all operations of java.concurrent.Atomic* classes
     * all assignments to volatile longs and doubles
     *
     * 问题来了，为什么long型赋值不是原子操作呢？例如：
     * long foo = 65465498L;
     * 实时上java会分两步写入这个long变量，先写32位，再写后32位。
     * 这样就线程不安全了。如果改成下面的就线程安全了：
     * private volatile long foo;
     * 因为volatile内部已经做了synchronized.
     *
     *
     * 要实现无锁（lock-free）的非阻塞算法有多种实现方法，其中CAS（比较与交换，
     * Compare and swap）是一种有名的无锁算法。
     * CAS, CPU指令，在大多数处理器架构，包括IA32、Space中采用的都是CAS指令，
     * CAS的语义是“我认为V的值应该为A，如果是，那么将V的值更新为B，
     * 否则不修改并告诉V的值实际为多少”，CAS是项乐观锁技术，
     * 当多个线程尝试使用CAS同时更新同一个变量时，只有其中一个线程能更新变量的值，
     * 而其它线程都失败，失败的线程并不会被挂起，而是被告知这次竞争中失败，
     * 并可以再次尝试。CAS有3个操作数，内存值V，旧的预期值A，要修改的新值B。
     * 当且仅当预期值A和内存值V相同时，将内存值V修改为B，否则什么都不做。
     * CAS无锁算法的C实现如下：
     *
     * int compare_and_swap (int* reg, int oldval, int newval)
     * {
     *   ATOMIC();
     *   int old_reg_val = *reg;
     *   if (old_reg_val == oldval)
     *       *reg = newval;
     *   END_ATOMIC();
     *   return old_reg_val;
     * }
     *
     * CAS比较与交换的伪代码可以表示为：
     * do{
     *  备份旧数据；
     *  基于旧数据构造新数据；
     * }while(!CAS( 内存地址，备份的旧数据，新数据 ))
     *
     * compare and swap
     *
     *（上图的解释：CPU去更新一个值，但如果想改的值不再是原来的值，操作就失败，
     * 因为很明显，有其它操作先改变了这个值。）
     *
     * 就是指当两者进行比较时，如果相等，则证明共享数据没有被修改，替换成新值，
     * 然后继续往下运行；如果不相等，说明共享数据已经被修改，放弃已经所做的操作，
     * 然后重新执行刚才的操作。容易看出 CAS 操作是基于共享数据不会被修改的假设，
     * 采用了类似于数据库的 commit-retry 的模式。当同步冲突出现的机会很少时，
     * 这种假设能带来较大的性能提升。
     *
     *
     * 前面说过了，CAS（比较并交换）是CPU指令级的操作，只有一步原子操作，
     * 所以非常快。而且CAS避免了请求操作系统来裁定锁的问题，不用麻烦操作系统，
     * 直接在CPU内部就搞定了。但CAS就没有开销了吗？不！有cache miss的情况。
     * 这个问题比较复杂，首先需要了解CPU的硬件体系结构：
     *
     *
     *
     * https://www.jianshu.com/p/3179005184dd
     *
     * 在多线程高并发编程的时候，最关键的问题就是保证共享对象的安全访问。
     * 通常是用synchronized 来处理，其实加锁本质上是将并发转变为串行来实现的，
     * 势必会影响吞吐量。
     *
     * 而最高效的做法就是不加锁，那就是CAS，Compare and Swap即比较并替换，
     * 设计并发算法时常用到的一种技术，Doug lea大神在java同步器中大量使用了CAS技术，
     * 鬼斧神工的实现了多线程执行的安全性。
     *
     * CAS实现原理：CAS有三个操作数：内存值V、旧的预期值A、要修改的值B，
     * 当且仅当预期值A和内存值V相同时，将内存值修改为B并返回true，
     * 否则什么都不做并返回false。
     *
     * 与锁相比，CAS会使得程序设计比较负责，但是由于其优越的性能优势，
     * 以及天生免疫死锁（根本就没有锁，当然就不会有线程一直阻塞了），
     * 更为重要的是，使用无锁的方式没有所竞争带来的开销，也没有线程间频繁调度带来的开销，
     * 他比基于锁的方式有更优越的性能，所以在目前被广泛应用，我们在程序设计时也可以适当的使用.
     *
     * https://blog.csdn.net/vernonzheng/article/details/8241213
     *
     *
     * https://www.jianshu.com/p/9c713de7bbdb
     *
     * ConcurrentHashMap 类中包含两个静态内部类 HashEntry 和 Segment。
     * HashEntry 用来封装映射表的键 / 值对；Segment 用来充当锁的角色，
     * 每个 Segment 对象守护整个散列映射表的若干个桶。每个桶是由若干个
     * HashEntry 对象链接起来的链表。一个 ConcurrentHashMap 实例中包含由若干个
     * Segment 对象组成的数组。
     *
     *
     * ConcurrentHashMap内部使用段(Segment)来表示这些不同的部分，
     * 每个段其实就是一个小的hash table，它们有自己的锁。
     * 只要多个修改操作发生在不同的段上，它们就可以并发进行。
     * 同样当一个线程占用锁访问其中一个段数据的时候，其他段的数据也能被其他线程访问。
     *
     * ConcurrentHashMap有些方法需要跨段，比如size()和containsValue()，
     * 它们可能需要锁定整个表而而不仅仅是某个段，这需要按顺序锁定所有段，
     * 操作完毕后，又按顺序释放所有段的锁。这里“按顺序”是很重要的，否则极有可能出现死锁，
     * 在ConcurrentHashMap内部，段数组是final的，并且其成员变量实际上也是final的，
     * 但是，仅仅是将数组声明为final的并不保证数组成员也是final的，这需要实现上的保证。
     * 这可以确保不会出现死锁，因为获得锁的顺序是固定的。
     * 不变性是多线程编程占有很重要的地位，下面还要谈到。
     *
     * https://sakyone.iteye.com/blog/668091
     *
     *
     *
     *
     *
     * */

    /**
     * Hbase写入数据时候是怎么保存数据的
     *
     * https://blog.csdn.net/wuxintdrh/article/details/69056188
     *
     *
     *
     *
     * */

}
