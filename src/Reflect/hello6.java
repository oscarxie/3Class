package Reflect;

public class hello6 {
	public static void main(String[] args) {
        Class<?> demo=null;
        try{
            demo=Class.forName("Reflect.Person");
        }catch (Exception e) {
            e.printStackTrace();
        }
        //ȡ�ø���
        Class<?> temp=demo.getSuperclass();
        System.out.println("�̳еĸ���Ϊ��   "+temp.getName());
    }
}
