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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=459319&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * Find longest poolChain
 * <p>
 * input: List<Log>
 * output: 最长的poolchain
 * <p>
 * log结构:
 * Long timestamp
 * int driver_id
 * int passenger_id
 * String pickup / dropoff
 * <p>
 * poolchain的定义：
 * 直接或者间接的有overlap的行程（乘客）数目
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * Given the travel time of each customer. Find the driver with the longest chain of trips,
 * which means there is always at least one person on the car.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * It's a merge segment problem. The idea is sort the customer's travel time and merge the segments.
 * class Segment {
 * int start;
 * int end;
 * int driverID;
 * ...
 * }
 * <p>
 * int findDriver(List(o1.start - o2.start));
 * <p>
 * <p>
 * int findDriver(List &amp;ltSegment&gt; travelTime) {
 * int maxTime = 0, driver = -1;
 * Collections.sort(travelTime, (o1,o2)-&gt; (o1.start - o2.start));
 * Map &lt; Integer, int[]&gt; tripChain = new HashMap&lt;&gt;();//map of &lt; driverID, [endTime, chainLength]&gt;
 * for(Segment s : travelTime) {
 * if(!tripChain.containsKey(s.driverID) {
 * tripChain.put(s.driverID, new int[]{s.end, s.end - s.start};
 * } else {
 * int[] time = tripChain.get(s.driverID);
 * time[1] += s.start &gt;= time[0] ? s.end - s.start: (s.end &gt; time[0] ? s.end - time[0]: 0);
 * time[0] = Math.max(time[0], s.end);
 * }
 * if(tripChain.get(s.driverID)[1] &gt; maxTime) {
 * driver = s.driverID;
 * maxTime = tripChain.get(driver)[1];
 * }
 * }
 * return driver;
 * }
 */

class Log {
    public long timestamp;
    public int driver_id;
    public int passenger_id;
    public boolean pickupOrDropoff;

    public Log(long timestamp, int driver_id, int passenger_id, boolean pickupOrDropoff) {
        this.timestamp = timestamp;
        this.driver_id = driver_id;
        this.passenger_id = passenger_id;
        this.pickupOrDropoff = pickupOrDropoff;
    }

}

class Trip {
    public long startTime;
    public long endTime;

    public Trip(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

}

public class Prob69 {

    //    class Trip {
    //        Log startLog;
    //        Log endLog;
    //    }

    //private static boolean isOverlap()

    public static int findLongestPoolChain(List<Log> logs) {
        Map<Integer, List<Trip>> map = new HashMap<>();
        Map<Integer, Map<Integer, Long>> startMap = new HashMap<>();
        for (Log log : logs) {
            if (map.get(log.driver_id) == null) {
                map.put(log.driver_id, new ArrayList<>());
            }
            if (startMap.get(log.driver_id) == null) {
                startMap.put(log.driver_id, new HashMap<>());
            }
            if (log.pickupOrDropoff) {
                startMap.get(log.driver_id).put(log.passenger_id, log.timestamp);
            } else {
                map.get(log.driver_id)
                        .add(new Trip(startMap.get(log.driver_id).get(log.passenger_id),
                                log.timestamp));
            }
        }

        for (Integer driverId : map.keySet()) {
            Collections.sort(map.get(driverId), new Comparator<Trip>() {
                @Override
                public int compare(Trip t1, Trip t2) {
                    return (int) (t1.startTime - t2.startTime);
                }
            });
        }

        int res = 0;

        for (Integer driverId : map.keySet()) {
            List<Trip> tripList = map.get(driverId);
            int tmp = 0;
            Trip prev = null;
            for (Trip trip : tripList) {
                if (prev == null) {
                    tmp = 1;
                    prev = trip;
                } else if (trip.startTime <= prev.endTime) {
                    tmp += 1;
                    prev = new Trip(prev.startTime, Math.max(trip.endTime, prev.endTime));
                } else {
                    prev = trip;
                    tmp = 0;
                }
                res = Math.max(res, tmp);
            }
        }
        return res;
    }

    /**
     * public Log(long timestamp, int driver_id, int passenger_id, boolean pickupOrDropoff) {
     * this.timestamp = timestamp;
     * this.driver_id = driver_id;
     * this.passenger_id = passenger_id;
     * this.pickupOrDropoff = pickupOrDropoff;
     * }
     */

    public static void main(String[] args) {
        List<Log> logs = new ArrayList<>();

        logs.add(new Log(1, 1, 1, true));
        logs.add(new Log(2, 1, 2, true));
        logs.add(new Log(4, 1, 2, false));
        logs.add(new Log(5, 1, 1, false));
        logs.add(new Log(7, 1, 3, true));
        logs.add(new Log(10, 1, 3, false));

        logs.add(new Log(1, 2, 1, true));
        logs.add(new Log(2, 2, 2, true));
        logs.add(new Log(4, 2, 2, false));
        logs.add(new Log(5, 2, 3, true));
        logs.add(new Log(7, 2, 1, false));
        logs.add(new Log(10, 2, 3, false));
        logs.add(new Log(12, 2, 4, true));
        logs.add(new Log(13, 2, 4, false));

        System.out.println(findLongestPoolChain(logs));

    }

}
