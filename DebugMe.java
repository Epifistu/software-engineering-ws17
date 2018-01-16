// compile with: javac -g ...

public class DebugMe {

class Item<T> {
  public Item( T _value, Item<T> _next ) {
    value = _value;
    next = _next;
  }

  public Item<T> next() { return next; }
  public void next(Item<T> _next) { next = _next; }
  public T value() { return value; }
  public void value(T _value) { value = _value; }

  private T value;
  private Item<T> next;
}

class LinkedList<T> {

  public LinkedList() { head = null; }

  // returns 0 on success, -1 on failure
  public int insert(T new_value) {
    head = new Item<T>(new_value, head);
    return (head != null) ? 0 : -1;
  }

  // returns 0 on success, -1 on failure
  public int remove (T value_to_remove) {
    Item<T> marker = head;
    Item<T> temp = null;  // temp points to one behind as we iterate

    while (marker != null) {
      if (marker.value() == value_to_remove) {
        if (temp == null) { // marker is the first element in the list
          if (marker.next() == null) {
            head = null;
            marker = null;
          } else {
            head = marker.next(); //bug #2 fixed
            marker = null;
          }
          return 0;
        } else {
          temp.next (marker.next());
          temp = null;
          return 0;
        }
      } //bug #1 fixed
      //marker = null;  // reset the marker
      temp = marker;
      marker = marker.next();
    }

    return -1;	// failure
  }

  public Item<T> find( T value ) {
    Item<T> marker = head; //bug #4 fixed
    while (marker != null) {
      if (marker.value() == value) {
        return marker;
      }
      marker = marker.next();
    }
    return null;
  }

  public void print() {
    Item<T> marker = head;
    System.out.println("Current state of list:");
    while (marker != null) { //bug #3 fixed
      System.out.println(marker.value());
      marker = marker.next();
    }
  }

  public void clear() {
    Item<T> marker = head;
    while (marker != null) {
      Item<T> temp = marker;
      temp = marker.next();
    }
  }

  private Item<T> head;
}

public void run() {

  LinkedList<Integer> list = new LinkedList<Integer>();

  System.out.println("Adding elements:");
  list.insert (1);
  list.insert (2);
  list.insert (3);
  list.insert (4);

  Item<Integer> query = list.find(2);
  System.out.println("Searching 2: found " + query.value().toString() );

  list.print();

  System.out.println("Removing elements:");
  list.remove(2);
  list.print();

  list.remove(4);
  list.print();

  list.remove(1);
  list.print();

  list.remove(2);
  list.print();

  list.remove(3);
  list.print();

  list.clear();
}

public static void main(String args[]) {
  DebugMe dbm = new DebugMe();
  dbm.run();
}

}
