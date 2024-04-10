package Core.Strings;

public class StringBufferVsStringBuilder {
    
    public static void main(String[] args) {
        
        System.out.println("--------> StringBuffer <--------");

        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer);
        buffer.append("world");
        System.out.println(buffer);
        buffer.append("!");
        System.out.println(buffer);

        System.out.println("--------> StringBuilder <--------");

        StringBuilder builder = new StringBuilder("Bounjor ");
        System.out.println(builder);
        builder.append("monde");
        System.out.println(builder);
        builder.append("!");
        System.out.println(builder);

        System.out.println("-------->StringBuilder vs StringBuilder <--------");
        
        long startTime = System.currentTimeMillis();
        StringBuffer sBuffer = new StringBuffer("Lets ");
        for(int i=0; i<100000; i++)
            sBuffer.append("go ");
        System.out.println("Time token by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        StringBuilder sBuilder = new StringBuilder("Lets ");
        for(int i=0; i<100000; i++)
            sBuilder.append("go ");
        System.out.println("Time token by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
