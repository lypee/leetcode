package medium.s56;

import java.util.LinkedList;
import java.util.List;

class Interval{
    int start ;
    int end ;
    Interval(){
        start = 0 ; end = 0 ;
    }
    Interval(int s , int e)
    {
        this.start = s ;
        this.end = e;
    }
}
public class s56 {
    public static void main(String[]args)
    {
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Interval interval = new Interval() ;

    }
    public List<Interval> merge(List<Interval> intervals)
    {
        if(intervals.size() == 0 || intervals == null)
        {
            return intervals ;
        }
        intervals.sort((i1, i2) ->
                Integer.compare(i1.start, i2.start));
        int start = intervals.get(0).start ;
        int end = intervals.get(0).end ;
        List<Interval> result = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            if (interval.start < end) {
                end = Math.max(end, interval.end);
            }else {
                result.add(new Interval(start, end));
                start = interval.start ;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));
        return result ;
    }

}
