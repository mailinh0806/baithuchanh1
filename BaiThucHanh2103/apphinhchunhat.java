public class hinhchunhat {
    float canh1;
    float canh2;

    public void nhap(float canh1, float canh2) {
        System.out.println(canh1);
        System.out.println(canh2);
        this.canh1 = canh1;
        this.canh2 = canh2;
    }

    public void dientichhcn() {
        System.out.println(canh1 * canh2);
    }

    public void chuvihcn() {
        System.out.println(2 * (canh1 + canh2));
    }

}