import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatePlus extends Create {
    CreatePlus(int a,int b,int p){
        first = a;
        second =b;
        page = p;
    }


    @Override
    public boolean makePage() {
        String message = "This is a sample message.\n";
        String space ="";
        String under="";
        File file = new File("add"+ System.currentTimeMillis()+".txt");

        FileWriter writer = null;
        Number number = new Number();

        for(int i = 0 ; i < (first-second)*2 - 1 ; i++){
            space += " ";
        }
        for(int i = 0 ; i < first*2+1; i++){
            under +="-";
        }

        try {
            writer = new FileWriter(file, true);


            for(int i = 0 ; i < page ; i++){
                for(int j = 0 ; j < 4 ; j++){
                    message = "    "+number.makeDigit(first)+"\t    "+number.makeDigit(first)+"\t    "+
                            number.makeDigit(first)+"\t    "+number.makeDigit(first)+"\n";
                    writer.write(message);
                    writer.flush();

                    if(first == second){

                        message = "+   " + space +number.makeDigit(second)+"\t" + "+   " + space +number.makeDigit(second)+"\t" +
                                "+   " + space +number.makeDigit(second)+"\t" +"+   " + space +number.makeDigit(second)+"\n";
                    }
                    else{
                        message = "+    " + space +number.makeDigit(second)+"\t" + "+    " + space +number.makeDigit(second)+"\t" +
                                "+    " + space +number.makeDigit(second)+"\t" +"+    " + space +number.makeDigit(second)+"\n";
                    }
                    writer.write(message);
                    writer.flush();

                    message = under+"\t"+under+"\t"+under+"\t"+under+"\n\n\n\n";
                    writer.write(message);
                    writer.flush();

                }
                message = "    "+number.makeDigit(first)+"\t    "+number.makeDigit(first)+"\t    "+
                        number.makeDigit(first)+"\t    "+number.makeDigit(first)+"\n";
                writer.write(message);
                writer.flush();

                message = "+    " + space +number.makeDigit(second)+"\t" + "+    " + space +number.makeDigit(second)+"\t" +
                        "+    " + space +number.makeDigit(second)+"\t" +"+    " + space +number.makeDigit(second)+"\n";
                writer.write(message);
                writer.flush();

                message = under+"\t"+under+"\t"+under+"\t"+under+"\n";
                writer.write(message);
                writer.flush();
            }

            System.out.println("DONE");
            return true;



        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null) writer.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

}

 class CreateMinus extends Create {
    CreateMinus(int a,int b,int p){
        first = a;
        second =b;
        page = p;
    }
     @Override
     public boolean makePage() {
         String message = "This is a sample message.\n";
         String space ="";
         String under="";
         File file = new File("sub"+ System.currentTimeMillis()+".txt");

         FileWriter writer = null;
         Number number = new Number();

         for(int i = 0 ; i < (first-second)*2 - 1 ; i++){
             space += " ";
         }
         for(int i = 0 ; i < first*2; i++){
             under +="-";
         }

         try {

             writer = new FileWriter(file, true);


             for(int i = 0 ; i < page ; i++){
                 for(int j = 0 ; j < 4 ; j++){
                     message = "  "+number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\t  "+
                             number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\n";
                     writer.write(message);
                     writer.flush();

                     message = "-  " + space +number.makeDigit(second)+"\t" + "-  " + space +number.makeDigit(second)+"\t" +
                             "-  " + space +number.makeDigit(second)+"\t" +"-  " + space +number.makeDigit(second)+"\n";
                     writer.write(message);
                     writer.flush();

                     message = under+"\t"+under+"\t"+under+"\t"+under+"\n\n\n\n";
                     writer.write(message);
                     writer.flush();

                 }
                 message = "  "+number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\t  "+
                         number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\n";
                 writer.write(message);
                 writer.flush();

                 message = "-  " + space +number.makeDigit(second)+"\t" + "-  " + space +number.makeDigit(second)+"\t" +
                         "-  " + space +number.makeDigit(second)+"\t" +"-  " + space +number.makeDigit(second)+"\n";
                 writer.write(message);
                 writer.flush();

                 message = under+"\t"+under+"\t"+under+"\t"+under+"\n";
                 writer.write(message);
                 writer.flush();
             }

             System.out.println("DONE");
             return true;



         } catch(IOException e) {
             e.printStackTrace();
         } finally {
             try {
                 if(writer != null) writer.close();
             } catch(IOException e) {
                 e.printStackTrace();
             }
         }

         return false;
     }



 }
 class CreateMul extends Create {
     CreateMul(int a,int b,int p){
         first = a;
         second =b;
         page = p;
     }
     @Override
     public boolean makePage() {
         String message = "This is a sample message.\n";
         String space ="";
         String under="";
         File file = new File("mul"+ System.currentTimeMillis()+".txt");

         FileWriter writer = null;
         Number number = new Number();

         for(int i = 0 ; i < (first-second)*2 - 1 ; i++){
             space += " ";
         }
         for(int i = 0 ; i < first*2; i++){
             under +="-";
         }

         try {

             writer = new FileWriter(file, true);


             for(int i = 0 ; i < page ; i++){
                 for(int j = 0 ; j < 4 ; j++){
                     message = "  "+number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\t  "+
                             number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\n";
                     writer.write(message);
                     writer.flush();

                     message = "x  " + space +number.makeDigit(second)+"\t" + "x  " + space +number.makeDigit(second)+"\t" +
                             "x  " + space +number.makeDigit(second)+"\t" +"x  " + space +number.makeDigit(second)+"\n";
                     writer.write(message);
                     writer.flush();

                     message = under+"\t"+under+"\t"+under+"\t"+under+"\n\n\n\n";
                     writer.write(message);
                     writer.flush();

                 }
                 message = "  "+number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\t  "+
                         number.makeDigit(first)+"\t  "+number.makeDigit(first)+"\n";
                 writer.write(message);
                 writer.flush();

                 message = "x  " + space +number.makeDigit(second)+"\t" + "x  " + space +number.makeDigit(second)+"\t" +
                         "x  " + space +number.makeDigit(second)+"\t" +"x  " + space +number.makeDigit(second)+"\n";
                 writer.write(message);
                 writer.flush();

                 message = under+"\t"+under+"\t"+under+"\t"+under+"\n";
                 writer.write(message);
                 writer.flush();
             }

             System.out.println("DONE");
             return true;



         } catch(IOException e) {
             e.printStackTrace();
         } finally {
             try {
                 if(writer != null) writer.close();
             } catch(IOException e) {
                 e.printStackTrace();
             }
         }

         return false;
     }

 }


