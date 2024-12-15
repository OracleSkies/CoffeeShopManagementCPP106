package CashierBranch;

import CashierSubBranch.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;   


public class CashierWindow extends javax.swing.JFrame {

    public CashierWindow() {
        initComponents();
        
        
        Dashboard.setVisible(true);
        OrderMenu.setVisible(false);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(false);
        
        CoffeeItems.setVisible(true);
        TeaItems.setVisible(false);
        FrappeItems.setVisible(false);
        PastriesItems.setVisible(false);
        
    }
    // SQL Connector
    private static Connection connect(){
        var dbURL = "jdbc:sqlite:coffeDB.db";
        
        try(Connection conn = DriverManager.getConnection(dbURL)){
            System.out.println("Connection to SQLlite has been establish");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        OrderMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        EndShifft = new javax.swing.JButton();
        OrderMenu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Coffee = new javax.swing.JButton();
        Tea = new javax.swing.JButton();
        Frappe = new javax.swing.JButton();
        Pastries = new javax.swing.JButton();
        CoffeeItems = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Americano = new javax.swing.JButton();
        IrishCof = new javax.swing.JButton();
        TurkishCof = new javax.swing.JButton();
        Cappucino = new javax.swing.JButton();
        Machiato = new javax.swing.JButton();
        Latte = new javax.swing.JButton();
        ColdBrew = new javax.swing.JButton();
        IcedCof = new javax.swing.JButton();
        Mocha = new javax.swing.JButton();
        Affogato = new javax.swing.JButton();
        TeaItems = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        HibiscusTea = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        ChaiTea = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        GingerTea = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        Matcha = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        ButterflyTea = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        FermentedTea = new javax.swing.JButton();
        GreeTea = new javax.swing.JButton();
        YellowTea = new javax.swing.JButton();
        WhiteTea = new javax.swing.JButton();
        BllackTea = new javax.swing.JButton();
        FrappeItems = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        CoockiesAndCreamFrappe = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        VanillaCaramelFrappe = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        CappucinoFrappe = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        ManggoFrappe = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        StrawberryFrappe = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        MatchaFrappe = new javax.swing.JButton();
        ChocolateFrappe = new javax.swing.JButton();
        DarkChocoFrappe = new javax.swing.JButton();
        JavaChipFrappe = new javax.swing.JButton();
        BlackForestFrappe = new javax.swing.JButton();
        PastriesItems = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Macaroons = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        RedVelvetCake = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        BlackForestCake = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        BukoPie = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        EggPie = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        Croissant = new javax.swing.JButton();
        Pandesal = new javax.swing.JButton();
        Ensaymada = new javax.swing.JButton();
        Doughnut = new javax.swing.JButton();
        Crinkles = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        SearchProductButton = new javax.swing.JButton();
        ViewOrder = new javax.swing.JButton();
        BackToDashboard = new javax.swing.JButton();
        SearchProduct = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        VIEWOrder2 = new javax.swing.JButton();
        BackButto2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Searchbar = new javax.swing.JTextField();
        Filter = new javax.swing.JButton();
        ShowAll = new javax.swing.JButton();
        CurrentOrder = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Orders = new javax.swing.JTable();
        ConfrimOrder = new javax.swing.JButton();
        bAck = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard.setBackground(new java.awt.Color(255, 51, 51));
        Dashboard.setOpaque(false);
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderMenuButton.setText("ORDER MENU");
        OrderMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderMenuButtonMouseClicked(evt);
            }
        });
        Dashboard.add(OrderMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORDER COUNTER");
        Dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("999");
        Dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("999");
        Dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SALES GENERATED");
        Dashboard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TRANSACTIONS FOR THIS SHIFT");
        Dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 470, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 480, 410));

        EndShifft.setText("END SHIFT");
        EndShifft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndShifftActionPerformed(evt);
            }
        });
        Dashboard.add(EndShifft, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 120, 40));

        MainPanel.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 680));

        OrderMenu.setBackground(new java.awt.Color(153, 255, 153));
        OrderMenu.setOpaque(false);
        OrderMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setOpaque(false);

        jPanel1.setOpaque(false);

        Coffee.setText("Coffee");
        Coffee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoffeeMouseClicked(evt);
            }
        });

        Tea.setText("Tea");
        Tea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeaMouseClicked(evt);
            }
        });

        Frappe.setText("Frappe");
        Frappe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrappeMouseClicked(evt);
            }
        });

        Pastries.setText("Pastries");
        Pastries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PastriesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Frappe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pastries, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Frappe, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pastries, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        OrderMenu.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 120, 630));

        CoffeeItems.setBackground(new java.awt.Color(139, 91, 41, 80));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Americano");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Irish Coffee");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Turkish Coffee");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cappucino");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Macchiato");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Latte");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cold Brew");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Iced Coffee");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mocha");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Affogato");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("COFFEE");

        Americano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Americano.png"))); // NOI18N
        Americano.setText("Americano");
        Americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmericanoActionPerformed(evt);
            }
        });

        IrishCof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Irish Coffee.png"))); // NOI18N
        IrishCof.setText("Irish Coffee");
        IrishCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrishCofActionPerformed(evt);
            }
        });

        TurkishCof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Turkish Brew.png"))); // NOI18N
        TurkishCof.setText("Turkish Coffee");
        TurkishCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurkishCofActionPerformed(evt);
            }
        });

        Cappucino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Cappucino.png"))); // NOI18N
        Cappucino.setText("Cappucino");
        Cappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappucinoActionPerformed(evt);
            }
        });

        Machiato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Macchiato.png"))); // NOI18N
        Machiato.setText("Machiato");
        Machiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MachiatoActionPerformed(evt);
            }
        });

        Latte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Latte.png"))); // NOI18N
        Latte.setText("Latte");
        Latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatteActionPerformed(evt);
            }
        });

        ColdBrew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Cold Brew.png"))); // NOI18N
        ColdBrew.setText("ColdBrew");
        ColdBrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColdBrewActionPerformed(evt);
            }
        });

        IcedCof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Iced Coffee.png"))); // NOI18N
        IcedCof.setText("Iced Coffee");
        IcedCof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedCofActionPerformed(evt);
            }
        });

        Mocha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Mocha.png"))); // NOI18N
        Mocha.setText("Mocha");
        Mocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MochaActionPerformed(evt);
            }
        });

        Affogato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/C_Affogato.png"))); // NOI18N
        Affogato.setText("Affogato");
        Affogato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffogatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoffeeItemsLayout = new javax.swing.GroupLayout(CoffeeItems);
        CoffeeItems.setLayout(CoffeeItemsLayout);
        CoffeeItemsLayout.setHorizontalGroup(
            CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoffeeItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CoffeeItemsLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CoffeeItemsLayout.createSequentialGroup()
                                .addComponent(Americano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(IrishCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TurkishCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addComponent(Cappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Machiato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Latte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addComponent(ColdBrew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IcedCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mocha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Affogato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        CoffeeItemsLayout.setVerticalGroup(
            CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoffeeItemsLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Americano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IrishCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(TurkishCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Machiato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addComponent(Latte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoffeeItemsLayout.createSequentialGroup()
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColdBrew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IcedCof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoffeeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)))
                    .addComponent(Mocha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Affogato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderMenu.add(CoffeeItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 360, 550));

        TeaItems.setBackground(new java.awt.Color(139, 91, 41, 80));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hibiscus Tea");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Chai Tea");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ginger Tea");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Matcha");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Butterfly Tea");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Fermented Tea");

        HibiscusTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Hibiscus Tea.png"))); // NOI18N
        HibiscusTea.setText("Hibiscus Tea");
        HibiscusTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HibiscusTeaActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("TEA");

        ChaiTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Chai Tea.png"))); // NOI18N
        ChaiTea.setText("Chai Tea");
        ChaiTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChaiTeaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Green Tea");

        GingerTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Ginger Tea.png"))); // NOI18N
        GingerTea.setText("Ginger Tea");
        GingerTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GingerTeaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Yellow Tea");

        Matcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Matcha.png"))); // NOI18N
        Matcha.setText("Matcha");
        Matcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchaActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("White Tea");

        ButterflyTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Butterfly Pea Tea.png"))); // NOI18N
        ButterflyTea.setText("Butterfly Tea");
        ButterflyTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButterflyTeaActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Black Tea");

        FermentedTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Fermented Tea.png"))); // NOI18N
        FermentedTea.setText("Fermented Tea");
        FermentedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermentedTeaActionPerformed(evt);
            }
        });

        GreeTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Green Tea.png"))); // NOI18N
        GreeTea.setText("Green Tea");
        GreeTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreeTeaActionPerformed(evt);
            }
        });

        YellowTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Yellow Tea.png"))); // NOI18N
        YellowTea.setText("Yellow Tea");
        YellowTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YellowTeaActionPerformed(evt);
            }
        });

        WhiteTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_White Tea.png"))); // NOI18N
        WhiteTea.setText("White Tea");
        WhiteTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteTeaActionPerformed(evt);
            }
        });

        BllackTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/T_Black Tea.png"))); // NOI18N
        BllackTea.setText("Black Tea");
        BllackTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BllackTeaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TeaItemsLayout = new javax.swing.GroupLayout(TeaItems);
        TeaItems.setLayout(TeaItemsLayout);
        TeaItemsLayout.setHorizontalGroup(
            TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeaItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TeaItemsLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TeaItemsLayout.createSequentialGroup()
                                .addComponent(GreeTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(YellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addComponent(BllackTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HibiscusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChaiTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addComponent(GingerTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Matcha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButterflyTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FermentedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        TeaItemsLayout.setVerticalGroup(
            TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeaItemsLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GreeTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)))
                    .addComponent(WhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BllackTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HibiscusTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addComponent(ChaiTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeaItemsLayout.createSequentialGroup()
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GingerTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Matcha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TeaItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)))
                    .addComponent(ButterflyTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FermentedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderMenu.add(TeaItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 360, 550));

        FrappeItems.setBackground(new java.awt.Color(139, 91, 41, 80));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Cookies and Cream");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Vanilla Caramel");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Cappucino");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Manggo");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Strawberry");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Matcha");

        CoockiesAndCreamFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Cookies Cream.png"))); // NOI18N
        CoockiesAndCreamFrappe.setText("Coockies And Cream");
        CoockiesAndCreamFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoockiesAndCreamFrappeActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("FRAPPE");

        VanillaCaramelFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Vanilla Caramel.png"))); // NOI18N
        VanillaCaramelFrappe.setText("Vanilla Caramel");
        VanillaCaramelFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanillaCaramelFrappeActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Chocolate");

        CappucinoFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Cappucino.png"))); // NOI18N
        CappucinoFrappe.setText("Cappucino");
        CappucinoFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappucinoFrappeActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Dark Choco");

        ManggoFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Mango.png"))); // NOI18N
        ManggoFrappe.setText("Manggo");
        ManggoFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManggoFrappeActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Java Chips");

        StrawberryFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Strawberry.png"))); // NOI18N
        StrawberryFrappe.setText("Strawberry");
        StrawberryFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberryFrappeActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Black Forest");

        MatchaFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Matcha.png"))); // NOI18N
        MatchaFrappe.setText("Matcha");
        MatchaFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchaFrappeActionPerformed(evt);
            }
        });

        ChocolateFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Chocolate.png"))); // NOI18N
        ChocolateFrappe.setText("Chocolate");
        ChocolateFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateFrappeActionPerformed(evt);
            }
        });

        DarkChocoFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Dark Choco.png"))); // NOI18N
        DarkChocoFrappe.setText("Dark Chocolate");
        DarkChocoFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkChocoFrappeActionPerformed(evt);
            }
        });

        JavaChipFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_Java Chips.png"))); // NOI18N
        JavaChipFrappe.setText("Java Chipp");
        JavaChipFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaChipFrappeActionPerformed(evt);
            }
        });

        BlackForestFrappe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F_BlackForest.png"))); // NOI18N
        BlackForestFrappe.setText("Black Forest");
        BlackForestFrappe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackForestFrappeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrappeItemsLayout = new javax.swing.GroupLayout(FrappeItems);
        FrappeItems.setLayout(FrappeItemsLayout);
        FrappeItemsLayout.setHorizontalGroup(
            FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrappeItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrappeItemsLayout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrappeItemsLayout.createSequentialGroup()
                                .addComponent(ChocolateFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DarkChocoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JavaChipFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addComponent(BlackForestFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CoockiesAndCreamFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VanillaCaramelFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addComponent(CappucinoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ManggoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StrawberryFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MatchaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        FrappeItemsLayout.setVerticalGroup(
            FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrappeItemsLayout.createSequentialGroup()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChocolateFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DarkChocoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)))
                    .addComponent(JavaChipFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BlackForestFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CoockiesAndCreamFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)))
                    .addComponent(VanillaCaramelFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrappeItemsLayout.createSequentialGroup()
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CappucinoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManggoFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FrappeItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)))
                    .addComponent(StrawberryFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatchaFrappe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderMenu.add(FrappeItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 360, 550));

        PastriesItems.setBackground(new java.awt.Color(139, 91, 41, 80));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Macaroons");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Red Velvet Cake");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Black Forest Cake");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Buko Pie");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Egg Pie");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Croissant");

        Macaroons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Macaroons.png"))); // NOI18N
        Macaroons.setText("Macaroons");
        Macaroons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacaroonsActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("COFFEE");

        RedVelvetCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Red Velvet Cake.png"))); // NOI18N
        RedVelvetCake.setText("Red Velvet Cake");
        RedVelvetCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedVelvetCakeActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Pandesal");

        BlackForestCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Black Forest Cake.png"))); // NOI18N
        BlackForestCake.setText("Black Forest Cake");
        BlackForestCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackForestCakeActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Ensaymada");

        BukoPie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Buko Pie.png"))); // NOI18N
        BukoPie.setText("Buko Pie");
        BukoPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BukoPieActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Doughnut");

        EggPie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Egg Pie.png"))); // NOI18N
        EggPie.setText("Egg Pie");
        EggPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EggPieActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Crinkles");

        Croissant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Croissant.png"))); // NOI18N
        Croissant.setText("Croissant");
        Croissant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CroissantActionPerformed(evt);
            }
        });

        Pandesal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Pandesal.png"))); // NOI18N
        Pandesal.setText("Pandesal");
        Pandesal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PandesalActionPerformed(evt);
            }
        });

        Ensaymada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Ensaymada.png"))); // NOI18N
        Ensaymada.setText("Ensaymada");
        Ensaymada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsaymadaActionPerformed(evt);
            }
        });

        Doughnut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Doughnut.png"))); // NOI18N
        Doughnut.setText("Doughnut");
        Doughnut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoughnutActionPerformed(evt);
            }
        });

        Crinkles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P_Crinkles.png"))); // NOI18N
        Crinkles.setText("Crinkles");
        Crinkles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrinklesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PastriesItemsLayout = new javax.swing.GroupLayout(PastriesItems);
        PastriesItems.setLayout(PastriesItemsLayout);
        PastriesItemsLayout.setHorizontalGroup(
            PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PastriesItemsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PastriesItemsLayout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PastriesItemsLayout.createSequentialGroup()
                                .addComponent(Pandesal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ensaymada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Doughnut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addComponent(Crinkles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Macaroons, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RedVelvetCake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addComponent(BlackForestCake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BukoPie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EggPie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Croissant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PastriesItemsLayout.setVerticalGroup(
            PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PastriesItemsLayout.createSequentialGroup()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pandesal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ensaymada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)))
                    .addComponent(Doughnut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Crinkles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Macaroons, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)))
                    .addComponent(RedVelvetCake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PastriesItemsLayout.createSequentialGroup()
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BlackForestCake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BukoPie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PastriesItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)))
                    .addComponent(EggPie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Croissant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OrderMenu.add(PastriesItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 360, 550));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("BEANS AND LEAVES ORDER MENU");
        OrderMenu.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 460, -1));

        SearchProductButton.setText("SEARCH");
        SearchProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchProductButtonMouseClicked(evt);
            }
        });
        OrderMenu.add(SearchProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 100, 40));

        ViewOrder.setText("VIEW ORDER");
        ViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrderMouseClicked(evt);
            }
        });
        OrderMenu.add(ViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 120, 40));

        BackToDashboard.setText("BACK");
        BackToDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToDashboardMouseClicked(evt);
            }
        });
        BackToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashboardActionPerformed(evt);
            }
        });
        OrderMenu.add(BackToDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 100, 40));

        MainPanel.add(OrderMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 680));

        SearchProduct.setBackground(new java.awt.Color(0, 102, 102));
        SearchProduct.setOpaque(false);

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("BEANS AND LEAVES SEARCH PRODUCT");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        VIEWOrder2.setText("VIEW ORDER");

        BackButto2.setText("BACK");
        BackButto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButto2MouseClicked(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Searchbar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Filter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Filter.setText("Filter");

        ShowAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ShowAll.setText("Show All");

        javax.swing.GroupLayout SearchProductLayout = new javax.swing.GroupLayout(SearchProduct);
        SearchProduct.setLayout(SearchProductLayout);
        SearchProductLayout.setHorizontalGroup(
            SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchProductLayout.createSequentialGroup()
                .addGroup(SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SearchProductLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchProductLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(VIEWOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(BackButto2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchProductLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Filter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowAll)
                                .addGap(6, 6, 6)))))
                .addContainerGap())
        );
        SearchProductLayout.setVerticalGroup(
            SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchProductLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel85)
                .addGap(18, 18, 18)
                .addGroup(SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButto2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VIEWOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        MainPanel.add(SearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 680));

        CurrentOrder.setBackground(new java.awt.Color(102, 0, 102));
        CurrentOrder.setOpaque(false);

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("BEANS AND LEAVES CURRENT ORDER");

        Orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Orders);

        ConfrimOrder.setText("CONFIRM ORDER");
        ConfrimOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfrimOrderActionPerformed(evt);
            }
        });

        bAck.setText("BACK");
        bAck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CurrentOrderLayout = new javax.swing.GroupLayout(CurrentOrder);
        CurrentOrder.setLayout(CurrentOrderLayout);
        CurrentOrderLayout.setHorizontalGroup(
            CurrentOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentOrderLayout.createSequentialGroup()
                .addGroup(CurrentOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CurrentOrderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CurrentOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CurrentOrderLayout.createSequentialGroup()
                                .addGap(0, 57, Short.MAX_VALUE)
                                .addComponent(ConfrimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(bAck, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))))
                .addContainerGap())
        );
        CurrentOrderLayout.setVerticalGroup(
            CurrentOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentOrderLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CurrentOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfrimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        MainPanel.add(CurrentOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 680));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cashier BG with Logo.png"))); // NOI18N
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="NAvs"> 
    private void OrderMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMenuButtonMouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(true);
        Dashboard.setVisible(false);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(false);
        
    }//GEN-LAST:event_OrderMenuButtonMouseClicked

    private void CoffeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoffeeMouseClicked
        // TODO add your handling code here:
        CoffeeItems.setVisible(true);
        TeaItems.setVisible(false);
        FrappeItems.setVisible(false);
        PastriesItems.setVisible(false);
        
    }//GEN-LAST:event_CoffeeMouseClicked

    private void TeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeaMouseClicked
        // TODO add your handling code here:
        CoffeeItems.setVisible(false);
        TeaItems.setVisible(true);
        FrappeItems.setVisible(false);
        PastriesItems.setVisible(false);
    }//GEN-LAST:event_TeaMouseClicked

    private void FrappeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrappeMouseClicked
        // TODO add your handling code here:
        CoffeeItems.setVisible(false);
        TeaItems.setVisible(false);
        FrappeItems.setVisible(true);
        PastriesItems.setVisible(false);
    }//GEN-LAST:event_FrappeMouseClicked

    private void PastriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PastriesMouseClicked
        // TODO add your handling code here:
        CoffeeItems.setVisible(false);
        TeaItems.setVisible(false);
        FrappeItems.setVisible(false);
        PastriesItems.setVisible(true);
    }//GEN-LAST:event_PastriesMouseClicked

    private void BackToDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToDashboardMouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(false);
        Dashboard.setVisible(true);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(false);
    }//GEN-LAST:event_BackToDashboardMouseClicked

    private void SearchProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchProductButtonMouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(false);
        Dashboard.setVisible(false);
        SearchProduct.setVisible(true);
        CurrentOrder.setVisible(false);
        
    }//GEN-LAST:event_SearchProductButtonMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BackButto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButto2MouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(true);
        Dashboard.setVisible(false);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(false);
    }//GEN-LAST:event_BackButto2MouseClicked

    private void bAckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAckMouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(true);
        Dashboard.setVisible(false);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(false);
    }//GEN-LAST:event_bAckMouseClicked

    private void ViewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderMouseClicked
        // TODO add your handling code here:
        OrderMenu.setVisible(false);
        Dashboard.setVisible(false);
        SearchProduct.setVisible(false);
        CurrentOrder.setVisible(true);
    }//GEN-LAST:event_ViewOrderMouseClicked
    
    private void EndShifftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndShifftActionPerformed
        
    }//GEN-LAST:event_EndShifftActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Coffee"> 
    private void AmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmericanoActionPerformed
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText); 
         
    }//GEN-LAST:event_AmericanoActionPerformed

    private void IrishCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrishCofActionPerformed
//        CoffeeBuilderwindow();
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_IrishCofActionPerformed

    private void TurkishCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurkishCofActionPerformed
       
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_TurkishCofActionPerformed

    private void CappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappucinoActionPerformed
        
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_CappucinoActionPerformed

    private void MachiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MachiatoActionPerformed
        
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_MachiatoActionPerformed

    private void LatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatteActionPerformed
        
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_LatteActionPerformed

    private void ColdBrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColdBrewActionPerformed
        
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_ColdBrewActionPerformed

    private void IcedCofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedCofActionPerformed
       
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_IcedCofActionPerformed

    private void MochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MochaActionPerformed
       
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_MochaActionPerformed

    private void AffogatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffogatoActionPerformed
        
        // Get the text of the clicked button
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open CoffeeCustomization and update JLabel
        CashierSubBranch.CoffeeCustomization coffeeCustomization = new CashierSubBranch.CoffeeCustomization();
        coffeeCustomization.setVisible(true);
        coffeeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_AffogatoActionPerformed
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="TEA"> 
    private void GreeTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreeTeaActionPerformed
        
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_GreeTeaActionPerformed

    private void YellowTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YellowTeaActionPerformed
        
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_YellowTeaActionPerformed

    private void WhiteTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_WhiteTeaActionPerformed

    private void BllackTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BllackTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_BllackTeaActionPerformed

    private void HibiscusTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HibiscusTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_HibiscusTeaActionPerformed

    private void ChaiTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChaiTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_ChaiTeaActionPerformed

    private void GingerTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GingerTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_GingerTeaActionPerformed

    private void MatchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_MatchaActionPerformed

    private void ButterflyTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButterflyTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_ButterflyTeaActionPerformed

    private void FermentedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermentedTeaActionPerformed

        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open TeaCustomization and update JLabel
        CashierSubBranch.TeaCustomization teaCustomization = new CashierSubBranch.TeaCustomization();
        teaCustomization.setVisible(true);
        teaCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_FermentedTeaActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="FRAPPE"> 
    private void ChocolateFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_ChocolateFrappeActionPerformed

    private void DarkChocoFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkChocoFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_DarkChocoFrappeActionPerformed

    private void JavaChipFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaChipFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_JavaChipFrappeActionPerformed

    private void BlackForestFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackForestFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_BlackForestFrappeActionPerformed

    private void CoockiesAndCreamFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoockiesAndCreamFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_CoockiesAndCreamFrappeActionPerformed

    private void VanillaCaramelFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanillaCaramelFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_VanillaCaramelFrappeActionPerformed

    private void CappucinoFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappucinoFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_CappucinoFrappeActionPerformed

    private void ManggoFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManggoFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_ManggoFrappeActionPerformed

    private void StrawberryFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberryFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_StrawberryFrappeActionPerformed

    private void MatchaFrappeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchaFrappeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open FrappeCustomization and update JLabel
        CashierSubBranch.FrappeCustomization frappeCustomization = new CashierSubBranch.FrappeCustomization();
        frappeCustomization.setVisible(true);
        frappeCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_MatchaFrappeActionPerformed
//</editor-fold>
    
    //badtrip
    private void BackToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToDashboardActionPerformed

    // <editor-fold defaultstate="collapsed" desc="PASTRY"> 
    private void PandesalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PandesalActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_PandesalActionPerformed

    private void EnsaymadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsaymadaActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_EnsaymadaActionPerformed

    private void DoughnutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoughnutActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_DoughnutActionPerformed

    private void CrinklesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrinklesActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_CrinklesActionPerformed

    private void MacaroonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacaroonsActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_MacaroonsActionPerformed

    private void RedVelvetCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedVelvetCakeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_RedVelvetCakeActionPerformed

    private void BlackForestCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackForestCakeActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_BlackForestCakeActionPerformed

    private void BukoPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BukoPieActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_BukoPieActionPerformed

    private void EggPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EggPieActionPerformed
        String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_EggPieActionPerformed

    private void CroissantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CroissantActionPerformed
       String buttonText = ((javax.swing.JButton) evt.getSource()).getText();
        
        // Open PastryCustomization and update JLabel
        CashierSubBranch.PastryCustomization pastryCustomization = new CashierSubBranch.PastryCustomization();
        pastryCustomization.setVisible(true);
        pastryCustomization.updateLabel(buttonText);
    }//GEN-LAST:event_CroissantActionPerformed
    // </editor-fold>
    
    
    private void ConfrimOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfrimOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfrimOrderActionPerformed
   
    

    
    
    
// <editor-fold defaultstate="collapsed" desc="FUNCTIONALITIS">  
    
    
    

        

    
    
    
// </editor-fold>

    
    
    public static void main(String args[]) {
        connect();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierWindow().setVisible(true);
            }
        });
    }
// <editor-fold defaultstate="collapsed" desc="BWESIT ANG HABA NETO">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Affogato;
    private javax.swing.JButton Americano;
    private javax.swing.JButton BackButto2;
    private javax.swing.JButton BackToDashboard;
    private javax.swing.JButton BlackForestCake;
    private javax.swing.JButton BlackForestFrappe;
    private javax.swing.JButton BllackTea;
    private javax.swing.JButton BukoPie;
    private javax.swing.JButton ButterflyTea;
    private javax.swing.JButton Cappucino;
    private javax.swing.JButton CappucinoFrappe;
    private javax.swing.JButton ChaiTea;
    private javax.swing.JButton ChocolateFrappe;
    private javax.swing.JButton Coffee;
    private javax.swing.JPanel CoffeeItems;
    private javax.swing.JButton ColdBrew;
    private javax.swing.JButton ConfrimOrder;
    private javax.swing.JButton CoockiesAndCreamFrappe;
    private javax.swing.JButton Crinkles;
    private javax.swing.JButton Croissant;
    private javax.swing.JPanel CurrentOrder;
    private javax.swing.JButton DarkChocoFrappe;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton Doughnut;
    private javax.swing.JButton EggPie;
    private javax.swing.JButton EndShifft;
    private javax.swing.JButton Ensaymada;
    private javax.swing.JButton FermentedTea;
    private javax.swing.JButton Filter;
    private javax.swing.JButton Frappe;
    private javax.swing.JPanel FrappeItems;
    private javax.swing.JButton GingerTea;
    private javax.swing.JButton GreeTea;
    private javax.swing.JButton HibiscusTea;
    private javax.swing.JButton IcedCof;
    private javax.swing.JButton IrishCof;
    private javax.swing.JButton JavaChipFrappe;
    private javax.swing.JButton Latte;
    private javax.swing.JButton Macaroons;
    private javax.swing.JButton Machiato;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton ManggoFrappe;
    private javax.swing.JButton Matcha;
    private javax.swing.JButton MatchaFrappe;
    private javax.swing.JButton Mocha;
    private javax.swing.JPanel OrderMenu;
    private javax.swing.JButton OrderMenuButton;
    private javax.swing.JTable Orders;
    private javax.swing.JButton Pandesal;
    private javax.swing.JButton Pastries;
    private javax.swing.JPanel PastriesItems;
    private javax.swing.JButton RedVelvetCake;
    private javax.swing.JPanel SearchProduct;
    private javax.swing.JButton SearchProductButton;
    private javax.swing.JTextField Searchbar;
    private javax.swing.JButton ShowAll;
    private javax.swing.JButton StrawberryFrappe;
    private javax.swing.JButton Tea;
    private javax.swing.JPanel TeaItems;
    private javax.swing.JButton TurkishCof;
    private javax.swing.JButton VIEWOrder2;
    private javax.swing.JButton VanillaCaramelFrappe;
    private javax.swing.JButton ViewOrder;
    private javax.swing.JButton WhiteTea;
    private javax.swing.JButton YellowTea;
    private javax.swing.JButton bAck;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}// </editor-fold>
