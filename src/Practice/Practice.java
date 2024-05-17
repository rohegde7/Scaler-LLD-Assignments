package Practice;

public class Practice {

    public static int getPoints(String[] args) {
        int sum = 0;

        for(int i =0; i<args.length; i++) {
            String value = args[i];
            try {
                int num = Integer.parseInt(value);
                sum += num;
            } catch (Exception e) {
                try {
                    if(value.equals("+")) {
                        sum += Integer.parseInt(args[i-1]);
                        sum += Integer.parseInt(args[i-2]);
                    } else if(value.equals("D")) {
                        sum += 2 * Integer.parseInt(args[i-1]);
                    } else if(value.equals("C")) {
                        sum -= Integer.parseInt(args[i-1]);
                    }
                } catch (Exception e2) {

                }
            }
        }

        return sum;
    }

    public static void main(String [] args) {
        System.out.println(Practice.getPoints(new String[] {"5","2","C","D","+",}));
    }
}
