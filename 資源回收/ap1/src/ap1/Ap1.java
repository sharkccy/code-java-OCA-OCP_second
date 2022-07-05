package ap1;

public class Ap1 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("JVM 全部 memory:" + rt.totalMemory() / 1000); // 單位是byte
        System.out.println("JVM 剩餘 memory:" + rt.freeMemory() / 1000);

        int A[] = new int[1000_000];
        System.out.println("宣告陣列後,剩餘 memory:" + rt.freeMemory() / 1000);

        A = null;
        System.out.println("A = null後 Memory:" + rt.freeMemory() / 1000);

        
        rt.gc();  // garbage collection: 資源回收
        System.out.println("call gc, Memory:" + rt.freeMemory() / 1000);
    }
}
