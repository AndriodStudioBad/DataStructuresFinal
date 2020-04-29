
import java.util.ArrayList;

public class DataAnalysis 
{
    private static ArrayList<Integer>[] graph; 
    private static int[] data;
    
    public static void Update()
    {
        graph = new ArrayList[11]; 
        data = TreeBall.getBellCurve();
                
        for(int x = 0; x < data.length; x++)
        {
            if(data[x] > 0)
            {
                graph[x].add(1);
                for(int y = 1; y <= data[x]; y++)
                {
                    graph[x].add(1);
                }
            }
        }
    }
    
   public static ArrayList<Integer>[] getGraph()
   {
       return graph;
   }
    
    
}
