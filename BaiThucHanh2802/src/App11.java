/**Cần có tổng số 200000 đồng từ 3 loại giấy bạc 10 000 đồng, 20 000 đồng và 50000
đồng, hãy lập chương trình để tìm tất cả các phương án có thể. */
public class App11 {
    public static void main(String[] args){
        int m = 10000, h = 20000, n = 50000, s, i, j, k;
        for (i = 0; i <= 20; i++)
            for (j = 0; j <= 10; j++)
                for (k = 0; k <= 4; k++)
                {
                    s = m*i + h*j + n*k;
                    if(s == 200000){
                        System.out.println("Truong hop " + i + " 10 000 dong " + j + " 20 000 dong "+ k + " 50 000 dong");
                    }
                }
    }
}
