public class ternary {
    public static void main (String[] args){
        int a = 20, b=10, c = 30, result;

        //comparing between a and b
        result = ((a>b)? a:b);

        //comparing between 3 numbers
        result = ((a>b) ? (a>c) ? a:c : (b>c) ? b:c);
        System.out.println("max: " + result);
    }
}

//syntax
//ternary operator
//condition ? expression_if_true : expression_if_false


/*
if (a>b) is True then a:c
then it checks (a>c)
if (a>c) is True, then a
else if (a>c) is False, then b

if (a>b) is False then b:c
then it checks (b>c)
if (b>c) is True, then b
else if (b>c) is False, then c

 */