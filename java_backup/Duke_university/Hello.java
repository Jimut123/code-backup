import edu.duke.*;
public class Hello
{
    public void SayHello()
    {
        FileResource resource = new FileResource("hello_unicode.txt");
        for(String line : resource.lines())
        {
        System.out.println(line);
    }
    }
}