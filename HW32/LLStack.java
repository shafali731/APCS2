//Shafali Gupta
//APCS2 pd 01
//HW32 - Leon Leonwood Stack
//2018-04-12

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE>{
  public LinkedList<PANCAKE> _stack;

  public LLStack(){
    _stack = new LinkedList<PANCAKE>();
  }

  public boolean isEmpty(){
    return _stack.size() == 0;
  }
  public PANCAKE peek(){
    if (isEmpty()){
      return null;
    }
    return _stack.get(_stack.size()-1); ///get last element
    }
  public PANCAKE pop(){
  //  return _stack.set(_stack.size()-1, null);
  return _stack.removeLast();
  }
  public void push (PANCAKE x){
    _stack.add(x);
  }
}
