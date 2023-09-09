package menugenerator;
import java.util.ArrayList;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                  
    private void initComponents() {
        // <editor-fold defaultstate="collapsed" desc="Variable Initialization">  
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        currentLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuList = new javax.swing.JList<>();
        moveUp = new javax.swing.JButton();
        moveDown = new javax.swing.JButton();
        menuDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        catName = new javax.swing.JTextField();
        cNameLabel = new javax.swing.JLabel();
        addCategory = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        newLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        menuName = new javax.swing.JTextField();
        mNameLabel = new javax.swing.JLabel();
        mPriceLabel = new javax.swing.JLabel();
        menuPrice = new javax.swing.JTextField();
        mDescLabel = new javax.swing.JLabel();
        menuImage = new javax.swing.JButton();
        catDropdown = new javax.swing.JComboBox<>();
        mCategoryLabel = new javax.swing.JLabel();
        addMenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        menuDescription = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        fileOpen = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        fileExport = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        helpInstruction = new javax.swing.JMenuItem();
        // </editor-fold>    
        // <editor-fold defaultstate="collapsed" desc="JGridLayout1">   
    
        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        // </editor-fold>  
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        currentLabel.setText("Current Menu ");

        menuList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return menu.size(); }
            public String getElementAt(int i) { return menu.get(i).getName(); }
        });
        jScrollPane1.setViewportView(menuList);

        moveUp.setText("Move Up");
        moveUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpActionPerformed(evt);
            }
        });

        moveDown.setText("Move Down");
        moveDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownActionPerformed(evt);
            }
        });

        menuDelete.setText("Delete");
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });
        // <editor-fold defaultstate="collapsed" desc="jPanel2">  
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(currentLabel)
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moveDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(moveUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(currentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveUp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveDown, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        ); 
        // </editor-fold>  

        categoryLabel.setText("Create Category");

        catName.setText("catName");

        cNameLabel.setText("Name");

        addCategory.setText("Add");
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });
        // <editor-fold defaultstate="collapsed" desc="jPanel2">   
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCategory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(categoryLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catName, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(categoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        // </editor-fold> 
        newLabel.setText("New Menu Items");

        menuName.setText("itemName");
        
        mNameLabel.setText("Name");

        mPriceLabel.setText("Price");

        menuPrice.setText("itemPrice");

        mDescLabel.setText("Description");

        menuImage.setText("Image");
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (String element : category) {
            catDropdown.addItem(element);
        }
        catDropdown.setModel(model);

        mCategoryLabel.setText("Category");

        addMenu.setText("Add");
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });

        menuDescription.setColumns(20);
        menuDescription.setRows(5);
        jScrollPane3.setViewportView(menuDescription);

        // <editor-fold defaultstate="collapsed" desc="jPanel4">
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(mCategoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(catDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mDescLabel)
                                .addComponent(mPriceLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(mNameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(newLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(newLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPriceLabel)
                    .addComponent(menuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuImage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mCategoryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
           
        // </editor-fold>  
        file.setText("File");

        fileOpen.setText("Open");
        fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenActionPerformed(evt);
            }
        });
        file.add(fileOpen);

        fileSave.setText("Save");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        file.add(fileSave);

        
        
        file.add(fileExport);

        jMenuBar1.add(file);

        help.setText("Help");

        helpInstruction.setText("Instructions");
        help.add(helpInstruction);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                  

    public void fileOpenActionPerformed(java.awt.event.ActionEvent evt) {   
        
        // Create a FileInputStream to read the object from a file
        JFileChooser fileChooser = new JFileChooser();

        // Show the file chooser and get the user's response
        int response = fileChooser.showSaveDialog(null);

        // If the user selected a file, write the object to it
        if (response == JFileChooser.APPROVE_OPTION) {
            this.mcdlist = null; // the object you want to set
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();
           
           
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(selectedFile))) {
                this.mcdlist = (arrayLists) ois.readObject();
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            catDropdown.removeAllItems();
            for(String cat:mcdlist.getCat()){
                catDropdown.addItem(cat);
            }
            updateMenuList(this.mcdlist);
        }
       
    }                                        

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {   
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = fileChooser.getSelectedFile();
            try {
                File newFile = new File(selectedDirectory, "menu.txt");
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
                    // Store an object in the file

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile))) {
                    oos.writeObject(mcdlist);
                }
            } catch (IOException e){
            
            }
         // Create a new file in the selected directory
            
        }
        
    } 
    private arrayLists sortMenu(arrayLists mcdlist) {  
        ArrayList<foodItem> temp = new ArrayList<>();
        for(String i : mcdlist.getCat()){
            for(foodItem j : mcdlist.getMenu()){
                if(j.getCat().equals(i)){
                    temp.add(j);
                }
            }
        }
        mcdlist.menu=temp;
        return mcdlist;
    } 
    
    private arrayLists addMenuActionPerformed(java.awt.event.ActionEvent evt) {   
        boolean alreadyExists =false;
        if((String)catDropdown.getSelectedItem()==null){
           
            String warningMessage = "Make sure to apply a Category";
            JOptionPane.showMessageDialog(null, warningMessage, "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            for(foodItem element : mcdlist.getMenu()){
                if(element.getName().equals(menuName.getText())){
                    String warningMessage = "A food item already has this name";
                    JOptionPane.showMessageDialog(null, warningMessage, "Warning", JOptionPane.WARNING_MESSAGE);
                    alreadyExists = true;
                }
            }
        }
        if(!alreadyExists){
            mcdlist.getMenu().add(new foodItem(menuName.getText(),menuPrice.getText(),menuDescription.getText(),(String)catDropdown.getSelectedItem(),""));
        }
        
        updateMenuList(mcdlist);
        return mcdlist;
    } 
    private arrayLists moveUpActionPerformed(java.awt.event.ActionEvent evt) { 
        int i = menuList.getSelectedIndex();
        sortMenu(mcdlist);
        if(i>0){
            for(int j=0;j<mcdlist.getCat().size();j++){
                if(mcdlist.getCat().get(j).equals(display.get(i))){
                    String temp = mcdlist.getCat().get(j-1);
                    mcdlist.getCat().set(j-1,mcdlist.getCat().get(j));
                    mcdlist.getCat().set(j, temp);
                    updateMenuList(mcdlist);
                    return mcdlist;
                }
            }
            for(int j=1;j<mcdlist.getMenu().size();j++){
                
                if(mcdlist.getMenu().get(j).getName().equals(display.get(i).substring(3))&&mcdlist.getMenu().get(j).getCat().equals(mcdlist.getMenu().get(j-1).getCat())){
                    
                    foodItem temp = mcdlist.getMenu().get(j-1);
                    mcdlist.getMenu().set(j-1,mcdlist.getMenu().get(j));
                    mcdlist.getMenu().set(j, temp);
                    updateMenuList(mcdlist);
                }
            }
        }
        return mcdlist;
    } 
    private arrayLists moveDownActionPerformed(java.awt.event.ActionEvent evt) {  
        int i = menuList.getSelectedIndex();
        sortMenu(mcdlist);
        if(i!=-1){
            for(int j=0;j<mcdlist.getCat().size();j++){
                if(mcdlist.getCat().get(j).equals(display.get(i))){
                    if(j+1<mcdlist.getCat().size()){
                        String temp = mcdlist.getCat().get(j);
                        mcdlist.getCat().set(j,mcdlist.getCat().get(j+1));
                        mcdlist.getCat().set(j+1, temp);
                        updateMenuList(mcdlist);
                    }
                    return mcdlist;
                }
            }
            for(int j=0;j<mcdlist.getMenu().size()-1;j++){              
                if(mcdlist.getMenu().get(j).getName().equals(display.get(i).substring(3))&&mcdlist.getMenu().get(j).getCat().equals(mcdlist.getMenu().get(j+1).getCat())){
                    foodItem temp = mcdlist.getMenu().get(j);
                    mcdlist.getMenu().set(j,mcdlist.getMenu().get(j+1));
                    mcdlist.getMenu().set(j+1, temp);
                    updateMenuList(mcdlist);
                    return mcdlist;
                }
            }
        }
        return mcdlist;
    } 
    private arrayLists menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {   
        int i = menuList.getSelectedIndex();
        if(i!=-1){          
            for(int j=0;j<mcdlist.getCat().size();j++){
                if(display.get(i).equals(mcdlist.getCat().get(j))){
                    catDropdown.removeItemAt(j);
                    for(int k=mcdlist.getMenu().size()-1;k>=0;k--){
                        if(mcdlist.getMenu().get(k).getCat().equals(mcdlist.getCat().get(j))){
                            mcdlist.getMenu().remove(k);
                        }
                    }
                    mcdlist.getCat().remove(j);
                    updateMenuList(mcdlist);
                    return mcdlist;
                }
            }
            for(int j=mcdlist.getMenu().size()-1;j>=0;j--){
                if(display.get(i).substring(3).equals(mcdlist.getMenu().get(j).getName())){
                    mcdlist.getMenu().remove(j);
                }
            }
            updateMenuList(mcdlist);
        }
        return mcdlist;
    } 
    private void updateMenuList(arrayLists mcdlist){
        display.clear();
        for(int i =0;i<mcdlist.getCat().size();i++){
            display.add(mcdlist.getCat().get(i));
            for(int j=0;j<mcdlist.getMenu().size();j++){
                if(mcdlist.getMenu().get(j).getCat().equals(mcdlist.getCat().get(i))){
                    display.add(" - "+mcdlist.getMenu().get(j).getName());
                }
            }
        }
        menuList.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return display.size(); }
            public String getElementAt(int i) { return display.get(i); }
        });
    }
    private arrayLists addCategoryActionPerformed(java.awt.event.ActionEvent evt) {   
        if(!mcdlist.getCat().contains(catName.getText())){
            mcdlist.getCat().add(catName.getText());
            catDropdown.addItem(catName.getText());
            updateMenuList(mcdlist);
        } else {
            String warningMessage = "Already have a category with this same name";
            JOptionPane.showMessageDialog(null, warningMessage, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        return mcdlist;
    } 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">   
    private javax.swing.JButton addCategory;
    private javax.swing.JButton addMenu;
    private javax.swing.JLabel cNameLabel;
    private javax.swing.JComboBox<String> catDropdown;
    private javax.swing.JTextField catName;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel currentLabel;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem fileExport;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem helpInstruction;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel mCategoryLabel;
    private javax.swing.JLabel mDescLabel;
    private javax.swing.JLabel mNameLabel;
    private javax.swing.JLabel mPriceLabel;
    private javax.swing.JButton menuDelete;
    private javax.swing.JTextArea menuDescription;
    private javax.swing.JButton menuImage;
    private javax.swing.JList<String> menuList;
    private javax.swing.JTextField menuName;
    private javax.swing.JTextField menuPrice;
    private javax.swing.JButton moveDown;
    private javax.swing.JButton moveUp;
    private javax.swing.JLabel newLabel;
    
    public transient ArrayList<foodItem> menu = new ArrayList<>();
    public transient ArrayList<String> category = new ArrayList<>();
    public transient ArrayList<String> display = new ArrayList<>();
    public arrayLists mcdlist = new arrayLists(menu,category,display);
    // </editor-fold>    
}
