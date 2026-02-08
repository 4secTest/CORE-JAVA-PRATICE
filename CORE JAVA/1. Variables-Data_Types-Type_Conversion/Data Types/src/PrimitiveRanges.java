public class PrimitiveRanges {
            public static void main(String[] args) {
                System.out.println("Byte:    " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
                System.out.println("Short:   " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
                System.out.println("Integer: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
                System.out.println("Long:    " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
                System.out.println("Float:   " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
                System.out.println("Double:  " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
                System.out.println("Char:    " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

                System.out.println();
                System.out.println("Sizes:");
                System.out.println("byte:    " + Byte.BYTES + " bytes = " + (Byte.BYTES * 8) + " bits");
                System.out.println("short:   " + Short.BYTES + " bytes = " + (Short.BYTES * 8) + " bits");
                System.out.println("int:     " + Integer.BYTES + " bytes = " + (Integer.BYTES * 8) + " bits");
                System.out.println("long:    " + Long.BYTES + " bytes = " + (Long.BYTES * 8) + " bits");
                System.out.println("float:   " + Float.BYTES + " bytes = " + (Float.BYTES * 8) + " bits");
                System.out.println("double:  " + Double.BYTES + " bytes = " + (Double.BYTES * 8) + " bits");
                System.out.println("char:    " + Character.BYTES + " bytes = " + (Character.BYTES * 8) + " bits");
            }
        }


