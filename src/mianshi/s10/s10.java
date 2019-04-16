package mianshi.s10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class s10 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] people = new int[m][2] ;
        int[] desk = new int[n];
        Arrays.sort(desk);
        String[] sss = br.readLine().split(" ") ;
        for(int i = 0 ; i < n ; i++)
        {
            desk[i] = Integer.parseInt(sss[i]) ;
        }
        PriorityQueue<Customer> pq = new PriorityQueue<>() ;
        for(int i = 0 ; i < m ; i++)
        {
            String[] ss = br.readLine().split(" ") ;
//            people[i][0] = Integer.parseInt(ss[0]);
//            people[i][1] = Integer.parseInt(ss[1]) ;
            int person = Integer.parseInt(ss[0]);
            int money = Integer.parseInt(ss[1]);
            if(person <= desk[n-1]){
                pq.offer(new Customer(person, money));
            }
        }
        long sum = 0 ;
        int count = 0 ;
        int[] visited = new int[n];
        for(int i = 0 ; !pq.isEmpty() ; i++)
        {
            Customer c = pq.poll();
            for(int j = 0 ; j < n ;j ++)
            {
                if(desk[j] >= c.person && visited[j] == 0 )
                {
                    sum += c.money ;
                    visited[j] = 1 ;
                    count ++ ;
                    break ;
                }
                if(count ==n)
                {
                    break ;
                }
            }
        }
        System.out.println(sum);
    }
    static class Customer implements Comparable<Customer>
    {
        int person ;
        int money ;
        public Customer(){}

        public Customer(int persion, int money) {
            this.person = persion ;
            this.money = money ;
        }

        @Override
        public int compareTo(Customer o) {
            if (this.money < o.money) {
                return 1 ;
            }else if(this.money > o.money)
            {
                return -1 ;
            }
            return 0 ;
        }
    }

}
