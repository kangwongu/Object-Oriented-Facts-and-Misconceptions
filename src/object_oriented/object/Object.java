package object_oriented.object;

public class Object {
    String data1;
    String data2;

    // 기능 예시
    public String concatString(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        return sb.toString();
    }
}
