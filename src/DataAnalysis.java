
import java.util.ArrayList;

public class DataAnalysis 
{
    private static ArrayList<Integer>[] graph; 
    private static int[] data;
    private static ArrayList<Integer> loc;
    
    
    public static void Update()
    {
        graph = new ArrayList[11]; 
        loc = new ArrayList<Integer>();
        
        for(int i = 0; i < 11; i++)
        {
            graph[i] = new ArrayList<Integer>();
        }
        
        data = TreeBall.getBellCurve();
                
        for(int x = 0; x < data.length; x++)
        {
            if(data[x] > 0)
            {
                graph[x].add(1);
                for(int y = 1; y <= data[x]; y++)
                {
                    graph[x].add(1);
                    loc.add(x);
                    System.out.println(x);
                }
            }
        }
    }
    
   public static ArrayList<Integer>[] getGraph()
   {
       return graph;
   }
    
   public static ArrayList<Integer> getVal()
   {
       return loc;
   }
    
}
