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

package yitu.src;

public class Prob4 {
    /**
     *   1、两个排好序的数组，求交集
     用两个光标分别扫描A,B数组，如果A[i] == B[j]，
     那么就是目标交集，i++,j++。否则，加那个比较小的。这样是O(N)的


     2、如果一个数组很大，有100w，另外一个很小,只有10
     扫描小的，然后二分大的，这样是O(nLogM)


     3、考虑一个1T的文本数据存储，硬盘7200转，I/O 100MB/s，内存16GB，带宽10GB。
     输入一个数，判断是否存在于文本中。问1s可以满足多少次访问
     给跪了，磁盘访问这个完全不会，现场教的，要用B+树思想，其实就是建立索引，
     16GB的索引，然后再读入索引对应的序列。
     在这样之上读入对应序列的时间几乎可以忽略不计，
     即没有用到100MB/s那么大的I/O，因此可以减少索引大小，让我算减少多少。
     我就列方程解，不知道为什么死活解不出来…可能饿得困得头昏眼花了…最后好险面试官放过我了。
     说我这种算法是学生思维，真正在工程里这是最简单的问题，你需要知道这个东西真正的瓶颈在哪里。


     https://superuser.com/questions/595967/calculating-hard-disk-block-model-reading-time

     The disk in question has a transfer rate of 80 MiB/s, or 81920 kiB/s,
     or 20480 blocks/s. Here, we will round off to 20,000 blocks/second,
     since this appears to be what your professor did. This equates to 0.05 ms
     to transfer a block, explaining the last term in the equation.

     Finally, in addition to seek time (time to move the drive head to the track),
     there is also the rotational latency of the disk itself to deal with.
     At 7200 RPM, in the worst case, we have to wait 1 full revolution,
     but on average we have to wait a half-revolution - or 4.166ms
     (7200 RPM = 120 rev/sec = 8.333ms/rev).

     https://sciencing.com/calculate-rotational-latency-8559684.html


     The 5 ms seek time is the time for the harddisk to move its head
     to the right track (and to select the right head,
     something which also takes time but which your prof. ignored).

     Once the head is over the right track it needs to wait for the right
     sector to pass beneath the R/W head. We are given that it is a 7200 RPM drive.
     That means:

     In the worst case the data just passed an it has to wait a full rotation.
     In the best case the data sector has just arrived. All is happy.
     In the average case the drive needs to wait half a rotation.
     To get the time for a full drive rotation on a 7200 RPM drive:

     7200 rotation per minute (aka 7200 RPM)
     Or 7200/60 times per second.
     Or 120 times per second.
     Or a single rotation takes 1/120 th of a second.
     Which is 8.3 ms
     So half a rotation should will take half that time, 1/240th of a second.

     1 second is 1000 ms

     This is your 1000/240 ms.



     Rotational latency is the amount of time required for an object,
     at some angular velocity, to achieve an entire rotation throughout its path.
     This calculation is used extensively in real-world applications.
     For example, the speedometer in a car is based on the size of the tires
     installed on the car. Changing the size of the tires changes the rotational
     latency and therefore induces error into the speedometer.
     This calculation is also used in the field of informatics to
     determine the maximum read time from a hard drive,
     as the data is stored on disks that rotate in angular fashion.



     Thus, to transfer one block to the computer,
     we must wait the equivalent Seek Time + Rotational Latency + Transfer Time:

     5 ms + 4.166 ms + 0.05 ms = 9.216 ms

     Note that for solid-state drives, while there is no rotational latency
     to take into account, there certainly still is a measurable seek time
     (to actually address the contents of the sectors in the flash memory)
     and transfer time (largely limited by the bus being used to transfer
     the data itself, e.g. SATA).


     Thus, in general, the total access time to read a single sector for a
     drive is (neglecting software):

     Rotational/Hard Drive:  Seek Time + Rotational Latency + Transfer Time

     Solid-State Drive:      Seek Time + Transfer Time


     *
     * */

}
