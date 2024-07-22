package com.rbtech.designpatterns.behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls=new ArrayList<>();

    public void  push(String str)
    {
        urls.add(str);
    }
    public String pop()
    {
     var lastIndex=urls.size()-1;
     var lastUrl=urls.get(lastIndex);

     urls.remove(lastUrl);

     return lastUrl;
    }

    public Iterator<String>  createIterator()
    {
        return new ListIterator(this);
    }



    public  class ListIterator implements Iterator<String>{
        private BrowserHistory browserHistory;
        private  int index=0;

        public ListIterator(BrowserHistory browserHistory){
            this.browserHistory=browserHistory;
        }

        @Override
        public boolean hasNext() {
            return (index< browserHistory.urls.size());
        }

        @Override
        public String current() {
            return browserHistory.urls.get(index);

        }

        @Override
        public void next() {
            index++;
        }
    }
}
