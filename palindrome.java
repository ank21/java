

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;
//imports for BufferedReader
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class palindrome {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);

        int n=s.nextInt();

        ArrayList<String> al=new ArrayList<>();

        for(int i=0;i<n;i++){
          String in=s.next();
        al.add(in);
      }
        List<String> ol=new ArrayList();
        for(String str:al){
            StringBuilder sb=new StringBuilder();
            sb.append(str);
            sb.reverse();
            String e=sb.toString();
          ol=al.stream().filter(st->st.equals(e)).collect(Collectors.toList());
            if(ol.size()>0){
              break;
            }

        }
        System.out.println(ol);
        s.close();


    }
}
