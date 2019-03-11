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

package uber.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=492718&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * uber 电面跪经
 * 给一组数据, uber driver ID 和对应的电话号码，一个id可能对应多个号码，
 * 如果多个id有对应相同的号码，那么他们就是一个人，求出这个多对多的集合对应关系
 * <p>
 * uuid -> phone number
 * a -> 1
 * b -> 2, 3
 * c -> 1
 * d -> 5
 * e -> 2
 * . From 1point 3acres bbs
 * <p>
 * 输出：
 * {a, c} -> {1}.
 * {b, e} -> {2, 3}
 * {d} -> {5}.
 * <p>
 * 虽然还没通知，但是感觉已跪，贡献数据了，各位好运，求加米
 */

public class Prob96 {

    public static void formMapping(Map<String, Set<Integer>> map) {
        Map<String, Set<String>> uuidNeighbors = new HashMap<>();
        Map<String, Set<Integer>> uuidPhoneNumbers = new HashMap<>();
        Map<Integer, Set<String>> reverseMap = new HashMap<>();
        Set<String> uuidVisited = new HashSet<>();
        for (String uuid : map.keySet()) {
            Set<Integer> phoneNumbers = map.get(uuid);
            for (Integer phoneNum : phoneNumbers) {
                if (reverseMap.get(phoneNum) == null) {
                    reverseMap.put(phoneNum, new HashSet<>());
                }
                reverseMap.get(phoneNum).add(uuid);
            }
        }
        for (String uuid : map.keySet()) {
            if (uuidVisited.contains(uuid)) {
                continue;
            }
            uuidNeighbors.put(uuid, new HashSet<>());
            uuidPhoneNumbers.put(uuid, new HashSet<>());
            Queue<String> queue = new LinkedList<>();
            queue.offer(uuid);
            uuidVisited.add(uuid);
            while (queue.size() != 0) {
                String uuidCur = queue.poll();
                Set<Integer> numbers = map.get(uuidCur);
                uuidPhoneNumbers.get(uuid).addAll(numbers);
                for (Integer number : numbers) {
                    for (String uuidNeighbor : reverseMap.get(number)) {
                        if (!uuidVisited.contains(uuidNeighbor)) {
                            uuidVisited.add(uuidNeighbor);
                            queue.offer(uuidNeighbor);
                            uuidNeighbors.get(uuid).add(uuidNeighbor);
                        }
                    }
                }
            }
        }
        for (String uuid : uuidNeighbors.keySet()) {
            Set<String> neighbors = uuidNeighbors.get(uuid);
            Set<Integer> phoneNumbers = uuidPhoneNumbers.get(uuid);
            StringBuilder keySb = new StringBuilder();
            keySb.append("{").append(uuid);
            for (String neighbor : neighbors) {
                if (!neighbor.equals(uuid)) {
                    keySb.append(",").append(neighbor);
                }
            }
            keySb.append("}");
            StringBuilder phoneSb = new StringBuilder();
            phoneSb.append("{");
            for (Integer phoneNum : phoneNumbers) {
                phoneSb.append(phoneNum).append(",");
            }
            phoneSb.deleteCharAt(phoneSb.length() - 1);
            phoneSb.append("}");
            System.out.println(keySb.toString() + "->" + phoneSb.toString());
        }
    }

    public static void main(String[] args) {
        Map<String, Set<Integer>> map = new HashMap<>();
        map.put("a", new HashSet<>(Arrays.asList(new Integer[] { 1 })));
        map.put("b", new HashSet<>(Arrays.asList(new Integer[] { 2, 3 })));
        map.put("c", new HashSet<>(Arrays.asList(new Integer[] { 1 })));
        map.put("d", new HashSet<>(Arrays.asList(new Integer[] { 5 })));
        map.put("e", new HashSet<>(Arrays.asList(new Integer[] { 2 })));
        formMapping(map);
    }

}
