public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10]; //set data, default capacity 10
    size=0;
    start=0;
    end=0;
  }
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity]; //set data, default capacity set at parameter
    size=0;
    start=0;
    end=0;
  }
  public int size(){
    return size;
  }
  public String toString(){
    String ans='[';
    for (int i=start;i<data.length;i++){
      if(!i==data.length-1){
        ans+=data[i]+", ";
      }else ans+=data[i]+"]";
    }
    return ans;
  }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  public E removeFirst(){
    return data[1];
  }
  public E removeLast(){
    return data[0];
  }
  public E getFirst(){
    return data[0];
  }
  public E getLast(){
    return data[1];
  }
}
