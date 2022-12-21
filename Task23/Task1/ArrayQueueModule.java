package Task1;
import Task2.AbstractQueue;

// инвариант: очередь - queue[head]..queue[tail]
public class ArrayQueueModule extends AbstractQueue {
    private Object[] q;

    private static ArrayQueueModule queue;

    // pre: queue - null
    // post: q.length = 10;
    private ArrayQueueModule(){
        q = new Object[START_CAPACITY];
        head = tail = 0;
    }

    // предусловие отсутствует
    // post: экземпляр только один
    public static ArrayQueueModule getInstance(){
        if(queue == null)
            queue = new ArrayQueueModule();
        return queue;
    }

    // pre: size > 0
    // post: queue[head] = queue[head+1]
    @Override
    public Object dequeue(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if(head == q.length) head = 0;
        if(Math.abs(head-tail) < q.length / 2) resize(q.length / 2);
        return r;
    }

    // предусловия нет
    // post: очередь не изменилась
    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    // предусловие отсутствует
    // post: queue[tail] = element
    @Override
    public void enqueue(Object element){
        q[tail++] = element;
        if(tail == q.length) tail = 0;
        if(tail == head) resize(q.length * 2);
    }

    // предусловие отсутствует
    // post: q.length == nSize
    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(q, head, nq, 0, Math.abs(head-tail));
        tail = Math.abs(head-tail);
        head = 0;
        q = nq;
    }

    // pre:  size > 0
    // post: будет возвращён первый элемент очереди
    @Override
    public Object element(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    // предусловие отсутствует
    // post: q.length = 10
    @Override
    public boolean clear(){
        boolean r = !isEmpty();
        head = tail = 0;
        resize(START_CAPACITY);
        return r;
    }

}
