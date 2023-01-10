import java.util.Arrays;

public class Student {
      private String gender;
      private int age;
      private int[] points;
      private double avg;

    public Student() {

    }

    public Student(String gender, int age, int[] points) {
        this.gender = gender;
        this.age = age;
        this.points = points;
    }

    public void setGender(String gender) throws Exception {
          if (!gender.equals("Male") && !gender.equals("Female")){
              throw new Exception("Invalid gender");
          }
          else {
              this.gender = gender;
          }
      }

      public void setAge(int age) throws Exception {
          if (age < 15 && age > 65){
              throw new Exception("Invalid age");
          }
          else{
            this.age = age;
          }
      }

      public void setPoint(int ... age) throws Exception {
          if (age.length < 4){
              throw new Exception("Invalid quantity points");
          }
          else {
              points = new int[4];
              for (int i = 0, j = age.length - 4; i < 4; i++, j++) {
                  if (age[j] < 1 && age[j] > 10){
                      throw new Exception("Invalid point");
                  }
                  else {
                      points[i] = age[j];
                  }
              }
          }
      }

      public void setAvg(){
          double sum = 0;
          for (int point : points){
              sum += point;
          }
          avg = sum / points.length;
      }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", points=" + Arrays.toString(points) +
                ", avg=" + avg +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int[] getPoints() {
        return points;
    }

    public double getAvg() {
        return avg;
    }
}

