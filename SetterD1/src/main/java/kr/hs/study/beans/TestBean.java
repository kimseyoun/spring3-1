package kr.hs.study.beans;


// TestBean 클래스
public class TestBean {
   private String name;
   private int age;
   private String addr;

   // 생성자
   public TestBean(String name, int age, String addr) {
      this.name = name;
      this.age = age;
      this.addr = addr;
   }

   // Getter, Setter
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getAddr() {
      return addr;
   }

   public void setCity(String city) {
      this.addr = city;
   }
}
