package com.rbtech.designpatterns.behavioural.mediator;

public class ArticelDialogBox {
    private ListBox articleListBox=new ListBox();
    private TextBox titleTextBox=new TextBox();
    private  Button saveButtom=new Button();


//    // anonyms inner class
//    public ArticelDialogBox() {
//        articleListBox.attach(new EventHandler() {
//            @Override
//            public void handle() {
//                articleSelected();
//            }
//        });
//    }


 // () -> {} :empty paranthesis goes to a class->lambda operator
    // using lambda expression
    public ArticelDialogBox() {
        articleListBox.addEventHandler(this::articleSelected); //event handler
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articleListBox.setSlection("Article1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Text Box :"+titleTextBox.getContent());
        System.out.println("Button:"+saveButtom.isIaEnabled());

    }



    private  void articleSelected()
    {
        titleTextBox.setContent(articleListBox.getSlection());
        saveButtom.setIaEnabled(true);
    }
    private void titleChanged()
    {
        var content=titleTextBox.getContent();
        var isEmpty=(content==null || content.isEmpty());
        saveButtom.setIaEnabled(!isEmpty);
    }
}
