package AD_2;

import java.util.*;

    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public class interval_scheduling {
        public static int maxMeetings(Interval[] intervals) {
            if (intervals == null || intervals.length == 0) {
                return 0;
            }

            Arrays.sort(intervals, Comparator.comparingInt(a -> a.end));

            int count = 1;
            int currEnd = intervals[0].end;

            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i].start >= currEnd) {
                    count++;
                    currEnd = intervals[i].end;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Interval[] intervals = {new Interval(1, 3), new Interval(2, 4), new Interval(3, 6), new Interval(5, 7), new Interval(8, 10), new Interval(9, 11)};
            System.out.println("Maximum number of meetings that can be scheduled: " + maxMeetings(intervals));
        }
    }
