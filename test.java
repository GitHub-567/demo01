public class demo2 {

public static void main(String[] args) {

for (int i = 100; i <1000 ; i++) {

int BaiNum = i/100;

int ShiNum = i/10%10;

int GeNum = i%10;

if(BaiNum*BaiNum*BaiNum + ShiNum*ShiNum*ShiNum+GeNum*GeNum*GeNum == i) {

System.out.println(i+"为水仙花数");

}

}

}

}
