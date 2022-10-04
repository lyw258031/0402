public class Triangle{
    public static void main(String[] args) {
        //1、声明二维数组，动态初始化
        int[][] yH = new int [10][];
        //2、数组元素赋值
        for(int i = 0;i < yH.length;i++) {
            yH[i] =new int[i + 1]; //定义总的行列格式
            //首末元素赋值1
            yH[i][0] = yH[i][i] = 1;
            //给每行非首末元素赋值
            if(i > 1) {
                for(int j = 1;j < yH[i].length - 1;j++) {
                    //从第二元素开始，到倒数第二元素
                    yH[i][j] = yH[i-1][j-1] + yH[i-1][j];
                }
            }
        }
        //3、遍历二维数组输出
        for(int i = 0;i < yH.length;i++) {
            for(int j = 0;j < yH[i].length;j++) {
                System.out.print(yH[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
