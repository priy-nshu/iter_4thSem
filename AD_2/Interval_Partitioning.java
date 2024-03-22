//package AD_2;
//
//import java.util.*;
//
//class interval {
//    int start;
//    int end;
//
//    public interval(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//}
//
//public class IntervalPartitioning {
//    public static int minMeetingRooms(interval[] interval) {
//        if (interval == null || interval.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(interval);
//
//        PriorityQueue rooms = new PriorityQueue<>();
//        rooms.add(interval[0].end);
//
//        for (int i = 1; i < interval.length; i++) {
//            if (interval[i].start >= rooms.peek()) {
//                rooms.poll();
//            }
//            rooms.add(interval[i].end);
//        }
//
//        return rooms.size();
//    }
//
//    public static void main(String[] args) {
//        interval[] intervals = {new interval(0, 30), new interval(5, 10), new interval(15, 20)};
//        System.out.println("Minimum meeting rooms required: " + minMeetingRooms(intervals));
//    }
//}
//
