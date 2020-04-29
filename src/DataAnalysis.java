
import java.util.ArrayList;

public class DataAnalysis 
{
    ArrayList<Integer>[] graph; 
    int[] data;
    
    public DataAnalysis(int[] d)
    {
        graph = new ArrayList[11]; 
        data = d;
        
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
    
    public void Update(int[] d)
    {
        graph = new ArrayList[11]; 
        data = d;
                
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
    
    
}
