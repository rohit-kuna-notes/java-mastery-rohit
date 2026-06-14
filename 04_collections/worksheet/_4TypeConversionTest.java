
import java.util.function.DoubleBinaryOperator;

public class _4TypeConversionTest {
    public static void main(String[] args) {

        // primitive types
        // narrowing -> needs () brackets to be type casted
        // widening can be directly assigned
        
        // long to int -> narrowing -> needs () brackets to be type casted
        // TODO: long num1long = 1000000L;
        // TODO: int num1int = (int) num1long;
        // TODO: System.out.printf("num1long: %d to num1int: %d \n",num1long,num1int);

        // int to long -> widening can be directly assigned
        // TODO: int num2int = 2;
        // TODO: long num2long = num2int;
        // TODO: System.out.printf("num2long: %d to num2int: %d \n",num2long,num2int);

        // double to int -> narrowing
        // TODO: double num10double = 10;
        // TODO: int num10int = (int) num10double;

        // int to double -> widening
        // TODO: int num9int = 9;
        // TODO: double num9double = num9int;

        // ----
        // while using wrapper class
        // narrowing --> either use primitive & Boxing or if available use obj.intValue() or obj.longValue()
        // widening --> Class.valueOf()
        // Double to Integer --> narrowing
        // TODO: Double num12Double = 12.65;
        // TODO: Integer num12Integer = num12Double.intValue();

        // Double to Long --> narrowing
        // TODO: Double num15Double = 15.65;
        // TODO: Long num15Long = num15Double.longValue();

        // Integer to Double / Long --> widening
        // TODO: Integer num14Integer = 14;
        // TODO: Double num14Double = Double.valueOf(num14Integer);

        // ----
        // boxing and unboxing doesn't need any () or func, can be directly assigned and is internally handled by Java
        // boxing -> primitive to Class wrapper
        // TODO: int num3int= 3;
        // TODO: Integer num3Integer = num3int;

        // unboxing -> Class wrapper to primitive
        // TODO: Integer num4Integer = 4;
        // TODO: int num4int=num4Integer;

        // double to Double -> boxing
        // TODO: double num16double = 106.78;
        // TODO: Double num16Double = num16double;

        // Double to double -> unboxing
        // TODO: Double num19Double = 106.78;
        // TODO: double num19double = num19Double;

        // ----
        // primitive or Class num to String -> String.valueOf() // prefer this as can also be used in method reference

        // int to string
        // TODO: int num5int = 5;
        // TODO: String num5String = String.valueOf(num5int);

        // TODO: Integer num20Integer = 5;
        // TODO: String num20String = String.valueOf(num20Integer);

        // ----
        // for Class Number to String -> can also use obj.toString() 

        // Integer to String
        // TODO: Integer num6Integer = 6;
        // String num6String = num6Integer.toString();
        // TODO: String num6String = Integer.toString(num6Integer);

        // ----
        // String to primitive or Number -> NumberSubClass.parseInt()

        // String to int/Integer
        // TODO: String num7String = "7";
        // TODO: int num7int = Integer.parseInt(num7String);
        // TODO: int num7Integer = Integer.parseInt(num7String);

        // String to long/Long
        // TODO: String num8String = "8";
        // TODO: long num8long = Long.parseLong(num8String);
        // TODO: Long num8Long = Long.parseLong(num8String);

        // String to double/Double
        // TODO: String num11String = "11";
        // TODO: double num11double = Double.parseDouble(num11String);
        // TODO: Double num11Double = Double.parseDouble(num11String);

    }
}

