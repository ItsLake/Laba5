

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kostya
 */

public class Frame extends JFrame {

    private File file;
    List<Toy> toys = new ArrayList<Toy>();

    public Frame() {
// задание типа пользовательского интерфейса
        try{
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        }catch(Exception e){}
        initComponents();
    }

    public String[] readFile(File f) {
        String[] lines = new String[0];
        String[] buf;
        String s = "";
        int count = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
                //Скопируем текущий массив
                buf = lines;
                //Создадим новый на одну строку больше
                lines = new String[count + 1];
                System.arraycopy(buf, 0, lines, 0, buf.length);
                lines[count] = s;
                count++;
            }
            br.close();
        } catch (IOException e) {
        }
        return lines;
    }

    public void write(File f, String text) {
        try {
            FileWriter out = new FileWriter(f, true);
            try {
                out.write(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        Messages = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Create = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Add = new javax.swing.JMenuItem();
        Sort = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();

        FileChooser.setDialogTitle("This is open dialog");
        FileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Лабораторная работа №5");

        Messages.setFont(new java.awt.Font("Tahoma", 0, 10));

        jLabel1.setText("Тут добавляем...");

        jLabel2.setText("Тут смотрим...");

        jTable1.setModel(new ToysTableModel(toys));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doll", "Blocks", "Ball", "Constructor" }));
        jComboBox1.setToolTipText("Название игрушки");

        jTextField1.setToolTipText("цена");

        jSpinner1.setToolTipText("от ... ");

        jSpinner2.setToolTipText("до ... лет");

        jTextField2.setToolTipText("другое");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        File.setText("Файл");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0));
        Open.setText("Открыть...");
        Open.setBorder(null);
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Create.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        Create.setText("Создать...");
        Create.setBorder(null);
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        File.add(Create);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0));
        Exit.setText("Выход");
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        Menu.add(File);

        Edit.setText("Правка");

        Add.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        Add.setText("Добавить запись...");
        Add.setBorder(null);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        Edit.add(Add);

        Sort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        Sort.setText("Выполнить сортировку");
        Sort.setBorder(null);
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortActionPerformed(evt);
            }
        });
        Edit.add(Sort);

        Refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        Refresh.setText("Обновить");
        Refresh.setBorder(null);
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        Edit.add(Refresh);

        Menu.add(Edit);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Messages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addComponent(Separator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(360, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Messages, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(250, 250, 476, 417);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
// подтверждение закрытие окна
        JFrame frame = new JFrame();
        Object[] options = { "Да", "Нет" };
	int n = JOptionPane.showOptionDialog(frame, 
                "Вы хотите завершить работу приложения?",
                "Внимание!",
                JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
                null,
                options,
		options[1]);
	if (n == 0) {
            int n1 = JOptionPane.showOptionDialog(frame,
                    "Вы действительно хотите завершить работу приложения?",
                    "Внимание!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
            if (n1 == 0) {
                frame.setVisible(false);
                System.exit(0);
            }
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
// открывается окно ввода имени создаваемого файла
// /home/student/ - l, C:\\ - w
        JFrame frame = new JFrame();
        String name = (String)JOptionPane.showInputDialog(frame,
                null,
                "Введите имя",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "");
        if ((name != null) && (name.length() > 0)){
            try {
                file = new File("C:\\"+name+".txt");
                if (file.exists())
                    Messages.setText("Невозможно создать файл "+
                            file.getAbsolutePath()+
                            ", потомучто он уже существует.");
                else
                {
                    if (file.createNewFile())
                        Messages.setText("Создан файл: "+file.getAbsolutePath());
                    else
                        Messages.setText("Невозможно создать файл");
                }
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        List<Toy> toys1 = new ArrayList<Toy>();
        toys1.clear();
        jTable1.setModel(new ToysTableModel(toys1));
    }//GEN-LAST:event_CreateActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
// открывается окно выбора файла
        int returnVal = FileChooser.showOpenDialog(this);
        if (returnVal == FileChooser.APPROVE_OPTION) {
            toys.clear();
// чтение из файла
            String lines[] = readFile(FileChooser.getSelectedFile());
            for (int i = 0; i < lines.length; i++) {
                Scanner s = new Scanner(lines[i]);
                String name = s.next();
/* с помощью следующей строки дабл из файла распознается правильно
(писать через точку) */
                s.useLocale(Locale.US);
                double price = s.nextDouble();
                int minAge = s.nextInt();
                int maxAge = s.nextInt();
                int param = s.nextInt();
                s.close();
                toys.add(new Toy(name, price, minAge, maxAge, param));
            }
// вывод в таблицу
            jTable1.setModel(new ToysTableModel(toys));
            Messages.setText("Открыт файл "+ FileChooser.getSelectedFile().getName());
            file = FileChooser.getSelectedFile();
        }
    }//GEN-LAST:event_OpenActionPerformed
// фильтр текстовых файлов
    class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            return "Text documents (*.txt)";
        }
    }
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
// читаем введенное в строку для записи
        String newline=jComboBox1.getSelectedItem().toString()+" "+
                jTextField1.getText()+" "+
                jSpinner1.getValue().toString()+" "+
                jSpinner1.getValue().toString()+" "+
                jTextField2.getText()+" \n";
// пишем строку в файл
        write(file,newline);
        toys.add(new Toy(jComboBox1.getSelectedItem().toString(),
                Double.valueOf(jTextField1.getText()),
                Integer.parseInt(jSpinner1.getValue().toString()),
                Integer.parseInt(jSpinner2.getValue().toString()),
                Integer.parseInt(jTextField2.getText())));
// вывод в таблицу
        jTable1.setModel(new ToysTableModel(toys));
        Messages.setText("Новая запись добавлена");
    }//GEN-LAST:event_AddActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        toys.clear();
// чтение из файла
        String lines[] = readFile(file);
        for (int i = 0; i < lines.length; i++) {
            Scanner s = new Scanner(lines[i]);
            String name = s.next();
            s.useLocale(Locale.US);
            double price = s.nextDouble();
            int minAge = s.nextInt();
            int maxAge = s.nextInt();
            int param = s.nextInt();
            toys.add(new Toy(name, price, minAge, maxAge, param));
        }
// вывод в таблицу
        jTable1.setModel(new ToysTableModel(toys));
        Messages.setText("Вывод из файла обновлен");
    }//GEN-LAST:event_RefreshActionPerformed

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        toys.clear();
// четине из файла
        String lines[] = readFile(file);
// создаем массив цен для сортировки
        double prices [] = new double[lines.length];
        for (int i=0;i<lines.length;i++){
            Scanner s = new Scanner(lines[i]);
            String name = s.next();
            s.useLocale(Locale.US);
            double price = s.nextDouble();
            int minAge = s.nextInt();
            int maxAge = s.nextInt();
            int param = s.nextInt();
            prices[i]=price;
        }
// находим минимальную цену
        double minp=prices[0];
        for (int i=0;i<lines.length;i++){
            if (prices[i]<minp)
                minp=prices[i];
        }
// сортируем
        for (int i=0;i<lines.length;i++){
            if (minp*1.1>=prices[i]){
                Scanner s = new Scanner(lines[i]);
                String name = s.next();
                s.useLocale(Locale.US);
                double price = s.nextDouble();
                int minAge = s.nextInt();
                int maxAge = s.nextInt();
                int param = s.nextInt();
                toys.add(new Toy(name, price, minAge, maxAge, param));
                Collections.sort(toys);
            }
        }
// вывод в таблицу
        jTable1.setModel(new ToysTableModel(toys));
        Messages.setText("Данные отсортированы");
    }//GEN-LAST:event_SortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// читаем введенное в строку для записи
        String newline=jComboBox1.getSelectedItem().toString()+" "+
                jTextField1.getText()+" "+
                jSpinner1.getValue().toString()+" "+
                jSpinner1.getValue().toString()+" "+
                jTextField2.getText()+" \n";
// пишем строку в файл
        write(file,newline);
        toys.add(new Toy(jComboBox1.getSelectedItem().toString(),
                Double.valueOf(jTextField1.getText()),
                Integer.parseInt(jSpinner1.getValue().toString()),
                Integer.parseInt(jSpinner2.getValue().toString()),
                Integer.parseInt(jTextField2.getText())));
// вывод в таблицу
        jTable1.setModel(new ToysTableModel(toys));
        Messages.setText("Новая запись добавлена");
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add;
    private javax.swing.JMenuItem Create;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel Messages;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JMenuItem Sort;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}