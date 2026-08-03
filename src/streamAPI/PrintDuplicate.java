//package streamAPI;
//
//import java.util.Arrays;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class PrintDuplicate {
//    public static void main(String[] args) {
//        String input="Sunilgavaskar";
//        Map<String,Long>   duplicate= Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        duplicate.forEach((character,count)->
//                if(count>1)
//                    )
//
//    }
//}
