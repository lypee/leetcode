package mianshi.topN;

import com.sun.scenario.effect.impl.HeapImage;

/**
 * 小顶堆
 * 比堆顶小的直接丢掉
 */
public class topN {
    private  int parent(int n )
    {
        return (n-1) /2 ;
    }
    private int left (int n )
    {
        return 2 * n + 1 ;
    }
    private int right(int n )
    {
        return 2 * n + 2 ;
    }
    //构建堆
    private void buildHeap(int n , int[]data)
    {
        for(int i = 0 ; i < n ; i ++)
        {
            int t = i ;
            while(t != 0 && data[parent(t)] > data[t])
            {
                int temp = data[t];
                data[t] = data[parent(t)];
                data[parent(t)] = temp ;
                t = parent(t);
            }
        }
    }
    //调整data[i]
    private void adjust(int i , int n , int[] data)
    {
        if(data[i] <= data[0]){
            return ;
        }
        int temp = data[i];
        data[i] = data[0];
        data[0] = temp ;
        int t = 0 ;
        //堆顶
        while((left(t) < n && data[t] > data[left(t)]) || (right(t) < n
        && data[t] > data[right(t)])){
            if(right(t) < n && data[right(t)] < data[left(t)]){
                temp = data[t] ;
                data[t] = data[right(t)] ;
                data[right(t)] = temp ;
                t = right(t) ;
            }else{
                temp = data[t] ;
                data[t] = data[left(t)] ;
                data[left(t)] =temp ;
                t = left(t) ;
            }
        }
    }
    public void findTopN(int n , int[] data)
    {
        buildHeap(n, data) ;
        for(int i = 0 ; i < data.length ; i++)
        {
            adjust(i , n , data);
        }
    }
    public void printf(int[]data)
    {
        for(int i = 0 ; i < data.length ; i++)
        {
            System.out.print("\t" + data[i]);
        }
    }
}
