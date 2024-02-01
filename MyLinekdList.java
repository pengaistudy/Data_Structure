package Demo6;

public class MyLinekdList<E> {
    //定义一个头指针
    private Node<E> head = null;

    public boolean isEmpty(){
        return head == null;
    }

    public void add(E e){
        //生成结点
        Node<E> node = new Node<>(e,null);//e是要添加的数据，指针指向null，因为没有下一个元素
        //首先判断是否是第一次添加结点
        if (isEmpty()){
            head = node;
        }else {
            Node<E> cur = head;//不能更改头指针的指向，所以我们在定义一个标量来游动
            //先找到当前链表的末尾结点
            while (cur.next != null){
                cur = cur.next;
            }
            //直接在末尾插入结点
            cur.next = node;
        }
    }

    public int len(){
        int count = 0;
        Node<E> cur = head;//不能更改头指针的指向，所以我们在定义一个标量来游动
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void remove(E e){
        if (isEmpty()){
            throw new SingleLinkedListException("空链表无法删除结点");
        } else {
            Node<E> cur = head;
            Node<E> last = null;//指向当前结点的上一个结点
            //遍历一遍，寻找是哪个结点
            while (cur != null){
                if (cur.data == e){
                    break;
                }
                last = cur;
                cur = cur.next;
            }
            //如果执行这句话，说明while循环正常退出，不存在要删除的结点
            if(cur == null){
                throw new SingleLinkedListException("链表不存在该结点");
            }else {
                //先连
                last.next = cur.next;
                //后断
                cur.next = null;
            }
        }
    }

    public void forEach(){
        Node<E> cur = head;
        while(cur != null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();//遍历后换行
    }
}
