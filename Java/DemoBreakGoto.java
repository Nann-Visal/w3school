public class DemoBreakGoto {
    public static void main(String[] args){
        First:{
            System.out.println("Start First");
            Second:{
                System.out.println("Start Second");
                Thirt:{
                    System.out.println("Start Thirt");
                    break Thirt;
                }
                break Second;
            }
            break First;
        }
    }
}
