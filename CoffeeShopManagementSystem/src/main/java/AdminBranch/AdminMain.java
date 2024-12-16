/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminBranch;

import AdminSubWindow.SalesReport;
import AdminSubWindow.StaffPerformance;
import cellAction.TableActionEvent;
import cellAction.accountTableActionCellEditor;
import cellAction.accountTableActionCellRenderer;
import cellAction.restockTableActionCellEditor;
import cellAction.restockTableActionCellRenderer;
import databaseConnection.DBConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author User
 */
public class AdminMain extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement sqlPST = null;
    ResultSet sqlResult = null;
    public AdminMain() {
        initComponents();
        conn = DBConnection.connectionDB();
        
        Dashboard.setVisible(true);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(false);
        
        // <editor-fold defaultstate="collapsed" desc="TABLE POPULATION"> 
        showLineChart();
        populateIngredientsListTable();
        populateSalesMonitoringTable();
        populateRoleManagementTable();
        populateProductTable();
        populateRecentSalesTable();
        // </editor-fold> 
        
        TableActionEvent event = new TableActionEvent(){
            @Override 
            public void onRestock(int row){
                System.out.println("CLICKED");
                System.out.println(row);
            }
            @Override 
            public void onDelete(int row){
                System.out.println("CLICKED");
                System.out.println(row);
            }
            @Override 
            public void currentOrderOnView(int row){
                System.out.println("CLICKED");
                System.out.println(row);
            }
            @Override 
            public void searchOnView(int row){
                System.out.println("CLICKED");
                System.out.println(row);
            }
        };
        
        // <editor-fold defaultstate="collapsed" desc="GUI MODIFICATIONS"> 
        
        // <editor-fold defaultstate="collapsed" desc="TABLE CENTER">
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        IngredientsTable.setDefaultRenderer(Object.class, centerRenderer);
        SalesMonitoringTable.setDefaultRenderer(Object.class, centerRenderer);
        RoleManagementTable.setDefaultRenderer(Object.class, centerRenderer);
        ProductsTable.setDefaultRenderer(Object.class, centerRenderer);
        RecentSalesTable.setDefaultRenderer(Object.class, centerRenderer);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="CELL ACTION">
        IngredientsTable.getColumnModel().getColumn(2).setCellRenderer(new restockTableActionCellRenderer());
        IngredientsTable.getColumnModel().getColumn(2).setCellEditor(new restockTableActionCellEditor(event));
        
        RoleManagementTable.getColumnModel().getColumn(2).setCellRenderer(new accountTableActionCellRenderer());
        RoleManagementTable.getColumnModel().getColumn(2).setCellEditor(new accountTableActionCellEditor(event));
        // </editor-fold>
        
        RecentSalesTable.setOpaque(false);
        RecentSalesTable.setBackground(new java.awt.Color(204, 204, 204, 80));
        ((DefaultTableCellRenderer)RecentSalesTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(204, 204, 204, 80));
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        RecentSalesTable.setShowGrid(false);
        
        IngredientsTable.setOpaque(false);
        IngredientsTable.setBackground(new java.awt.Color(0, 0, 0, 100));
        ((DefaultTableCellRenderer)IngredientsTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(0, 0, 0, 100));
        IngredientsScrPane.setOpaque(false);
        IngredientsScrPane.getViewport().setOpaque(false);
        IngredientsTable.setShowGrid(false);
        
        ProductsTable.setOpaque(false);
        ProductsTable.setBackground(new java.awt.Color(0, 0, 0, 100));
        ((DefaultTableCellRenderer)ProductsTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(0, 0, 0, 100));
        productsScrPane.setOpaque(false);
        productsScrPane.getViewport().setOpaque(false);
        ProductsTable.setShowGrid(false);
        
        SalesMonitoringTable.setOpaque(false);
        SalesMonitoringTable.setBackground(new java.awt.Color(0, 0, 0, 100));
        ((DefaultTableCellRenderer)SalesMonitoringTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(0, 0, 0, 100));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        SalesMonitoringTable.setShowGrid(false);
        
        RoleManagementTable.setOpaque(false);
        RoleManagementTable.setBackground(new java.awt.Color(0, 0, 0, 100));
        ((DefaultTableCellRenderer)RoleManagementTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(0, 0, 0, 100));
        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);
        RoleManagementTable.setShowGrid(false);
        
        AuditLogsTable.setOpaque(false);
        AuditLogsTable.setBackground(new java.awt.Color(204, 204, 204, 80));
        ((DefaultTableCellRenderer)AuditLogsTable.getDefaultRenderer(Object.class)).setBackground(new java.awt.Color(204, 204, 204, 80));
        jScrollPane4.setOpaque(false);
        jScrollPane4.getViewport().setOpaque(false);
        AuditLogsTable.setShowGrid(false);
        // </editor-fold>    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        ButtonsPanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        inventory = new javax.swing.JButton();
        salesmonitoring = new javax.swing.JButton();
        rolemanagement = new javax.swing.JButton();
        systemsettings = new javax.swing.JButton();
        auditlogs = new javax.swing.JButton();
        PanelMain = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LineChart = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecentSalesTable = new javax.swing.JTable();
        Inventory = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IngredientsScrPane = new javax.swing.JScrollPane();
        IngredientsTable = new javax.swing.JTable();
        productsScrPane = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        SalesMonitoring = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        salesFilterCombo = new javax.swing.JComboBox<>();
        salesField = new javax.swing.JTextField();
        salesFilterButton = new javax.swing.JButton();
        salesShowAllButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SalesMonitoringTable = new javax.swing.JTable();
        salesGenReportButton = new javax.swing.JButton();
        cashierGenReportButton = new javax.swing.JButton();
        RoleManagement = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RoleManagementTable = new javax.swing.JTable();
        NewAccBut = new javax.swing.JButton();
        SystemSettings = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ProgrammablePhoto = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        ImportButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        AuditLogs = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AuditLogsTable = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonsPanel.setOpaque(false);

        dashboard.setBackground(new java.awt.Color(222, 160, 87));
        dashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("DASHBOARD");
        dashboard.setBorderPainted(false);
        dashboard.setContentAreaFilled(false);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });

        inventory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        inventory.setForeground(new java.awt.Color(255, 255, 255));
        inventory.setText("INVENTORY");
        inventory.setBorderPainted(false);
        inventory.setContentAreaFilled(false);
        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryMouseExited(evt);
            }
        });
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });

        salesmonitoring.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        salesmonitoring.setForeground(new java.awt.Color(255, 255, 255));
        salesmonitoring.setText("SALES MONITORING");
        salesmonitoring.setBorderPainted(false);
        salesmonitoring.setContentAreaFilled(false);
        salesmonitoring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesmonitoringMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesmonitoringMouseExited(evt);
            }
        });
        salesmonitoring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesmonitoringActionPerformed(evt);
            }
        });

        rolemanagement.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rolemanagement.setForeground(new java.awt.Color(255, 255, 255));
        rolemanagement.setText("ROLE MANAGEMENT");
        rolemanagement.setBorderPainted(false);
        rolemanagement.setContentAreaFilled(false);
        rolemanagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rolemanagementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rolemanagementMouseExited(evt);
            }
        });
        rolemanagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolemanagementActionPerformed(evt);
            }
        });

        systemsettings.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        systemsettings.setForeground(new java.awt.Color(255, 255, 255));
        systemsettings.setText("SYSTEM SETTINGS");
        systemsettings.setBorderPainted(false);
        systemsettings.setContentAreaFilled(false);
        systemsettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                systemsettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                systemsettingsMouseExited(evt);
            }
        });
        systemsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemsettingsActionPerformed(evt);
            }
        });

        auditlogs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        auditlogs.setForeground(new java.awt.Color(255, 255, 255));
        auditlogs.setText("AUDIT LOGS");
        auditlogs.setBorderPainted(false);
        auditlogs.setContentAreaFilled(false);
        auditlogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                auditlogsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                auditlogsMouseExited(evt);
            }
        });
        auditlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auditlogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesmonitoring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rolemanagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(systemsettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(auditlogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salesmonitoring, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rolemanagement, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(systemsettings, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(auditlogs, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 800));

        PanelMain.setOpaque(false);

        Dashboard.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DASHBOARD");

        LineChart.setBackground(new java.awt.Color(255, 255, 255));
        LineChart.setOpaque(false);
        LineChart.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECENT SALES");

        RecentSalesTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RecentSalesTable.setForeground(new java.awt.Color(255, 255, 255));
        RecentSalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cashier", "Product", "Category", "Sales", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecentSalesTable.setRowHeight(40);
        jScrollPane1.setViewportView(RecentSalesTable);

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LineChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                .addGap(0, 508, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(507, 507, 507))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LineChart, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        Inventory.setOpaque(false);
        Inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INVENTORY MANAGEMENT");
        Inventory.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 49));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INGREDIENTS");
        Inventory.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRODUCTS");
        Inventory.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        IngredientsTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        IngredientsTable.setForeground(new java.awt.Color(255, 255, 255));
        IngredientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredient", "Qty/Volume", "Restock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        IngredientsTable.setAlignmentY(0.1F);
        IngredientsTable.setRowHeight(40);
        IngredientsTable.setRowSelectionAllowed(false);
        IngredientsScrPane.setViewportView(IngredientsTable);

        Inventory.add(IngredientsScrPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 510));

        ProductsTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ProductsTable.setForeground(new java.awt.Color(255, 255, 255));
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductsTable.setRowHeight(40);
        productsScrPane.setViewportView(ProductsTable);
        if (ProductsTable.getColumnModel().getColumnCount() > 0) {
            ProductsTable.getColumnModel().getColumn(0).setResizable(false);
            ProductsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        Inventory.add(productsScrPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 570, 510));

        SalesMonitoring.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALES MONITORING");

        salesFilterCombo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salesFilterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Product", "Category" }));

        salesField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        salesFilterButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salesFilterButton.setText("FILTER");
        salesFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesFilterButtonActionPerformed(evt);
            }
        });

        salesShowAllButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salesShowAllButton.setText("VIEW ALL");
        salesShowAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesShowAllButtonActionPerformed(evt);
            }
        });

        SalesMonitoringTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SalesMonitoringTable.setForeground(new java.awt.Color(255, 255, 255));
        SalesMonitoringTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cashier", "Product", "Category", "Sales", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SalesMonitoringTable.setAlignmentY(0.1F);
        SalesMonitoringTable.setRowHeight(40);
        jScrollPane2.setViewportView(SalesMonitoringTable);

        salesGenReportButton.setBackground(new java.awt.Color(0, 0, 255));
        salesGenReportButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        salesGenReportButton.setForeground(new java.awt.Color(255, 255, 255));
        salesGenReportButton.setText("GENERATE SALES REPORT");
        salesGenReportButton.setContentAreaFilled(false);
        salesGenReportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesGenReportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesGenReportButtonMouseExited(evt);
            }
        });
        salesGenReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesGenReportButtonActionPerformed(evt);
            }
        });

        cashierGenReportButton.setBackground(new java.awt.Color(0, 0, 255));
        cashierGenReportButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cashierGenReportButton.setForeground(new java.awt.Color(255, 255, 255));
        cashierGenReportButton.setText("GENERATE CASHIER REPORT");
        cashierGenReportButton.setContentAreaFilled(false);
        cashierGenReportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashierGenReportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashierGenReportButtonMouseExited(evt);
            }
        });
        cashierGenReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierGenReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SalesMonitoringLayout = new javax.swing.GroupLayout(SalesMonitoring);
        SalesMonitoring.setLayout(SalesMonitoringLayout);
        SalesMonitoringLayout.setHorizontalGroup(
            SalesMonitoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesMonitoringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SalesMonitoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(SalesMonitoringLayout.createSequentialGroup()
                        .addComponent(salesFilterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salesField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salesFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salesShowAllButton)))
                .addContainerGap())
            .addGroup(SalesMonitoringLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel7)
                .addGap(0, 411, Short.MAX_VALUE))
            .addGroup(SalesMonitoringLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(salesGenReportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cashierGenReportButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalesMonitoringLayout.setVerticalGroup(
            SalesMonitoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalesMonitoringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(SalesMonitoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(salesField)
                    .addComponent(salesFilterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesShowAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesFilterCombo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SalesMonitoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesGenReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cashierGenReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        RoleManagement.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ROLE MANAGEMENT");

        RoleManagementTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RoleManagementTable.setForeground(new java.awt.Color(255, 255, 255));
        RoleManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Account Type", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RoleManagementTable.setRowHeight(40);
        jScrollPane3.setViewportView(RoleManagementTable);

        NewAccBut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NewAccBut.setForeground(new java.awt.Color(255, 255, 255));
        NewAccBut.setText("CREATE NEW ACCOUNT");
        NewAccBut.setBorderPainted(false);
        NewAccBut.setContentAreaFilled(false);
        NewAccBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewAccButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewAccButMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RoleManagementLayout = new javax.swing.GroupLayout(RoleManagement);
        RoleManagement.setLayout(RoleManagementLayout);
        RoleManagementLayout.setHorizontalGroup(
            RoleManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoleManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoleManagementLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NewAccBut)
                .addGap(441, 441, 441))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoleManagementLayout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(407, 407, 407))
        );
        RoleManagementLayout.setVerticalGroup(
            RoleManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoleManagementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAccBut)
                .addContainerGap())
        );

        SystemSettings.setOpaque(false);
        SystemSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SYSTEM SETTINGS");
        SystemSettings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BUSINESS NAME:");
        SystemSettings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BUSINESS ADDRESS:");
        SystemSettings.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTACT NUMBER:");
        SystemSettings.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 25));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgrammablePhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgrammablePhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );

        SystemSettings.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SystemSettings.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 133, 570, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SystemSettings.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 189, 570, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SystemSettings.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 245, 570, -1));

        ImportButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ImportButton.setForeground(new java.awt.Color(255, 255, 255));
        ImportButton.setText("IMPORT PHOTO");
        ImportButton.setBorderPainted(false);
        ImportButton.setContentAreaFilled(false);
        ImportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImportButtonMouseExited(evt);
            }
        });
        SystemSettings.add(ImportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 301, 270, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LOGO:");
        SystemSettings.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 308, -1, 25));

        ConfirmButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("CONFIRM DETAILS");
        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseExited(evt);
            }
        });
        SystemSettings.add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 230, 50));

        AuditLogs.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("AUDIT LOGS");

        AuditLogsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(AuditLogsTable);

        javax.swing.GroupLayout AuditLogsLayout = new javax.swing.GroupLayout(AuditLogs);
        AuditLogs.setLayout(AuditLogsLayout);
        AuditLogsLayout.setHorizontalGroup(
            AuditLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuditLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(AuditLogsLayout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel14)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        AuditLogsLayout.setVerticalGroup(
            AuditLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AuditLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Inventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SalesMonitoring, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RoleManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SystemSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AuditLogs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SalesMonitoring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(RoleManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SystemSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AuditLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 1170, 620));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admin BG 1500x800.png"))); // NOI18N
        Background.setToolTipText("");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="EVENTS"> 
    private void salesShowAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesShowAllButtonActionPerformed
        // TODO add your handling code here:
        populateSalesMonitoringTable();
    }//GEN-LAST:event_salesShowAllButtonActionPerformed

    private void systemsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemsettingsActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(true);
        AuditLogs.setVisible(false);
    }//GEN-LAST:event_systemsettingsActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(true);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(false);
        showLineChart();
    }//GEN-LAST:event_dashboardActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Inventory.setVisible(true);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(false);
    }//GEN-LAST:event_inventoryActionPerformed

    private void salesmonitoringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesmonitoringActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(true);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(false);
    }//GEN-LAST:event_salesmonitoringActionPerformed

    private void rolemanagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolemanagementActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(true);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(false);
    }//GEN-LAST:event_rolemanagementActionPerformed

    private void auditlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auditlogsActionPerformed
        // TODO add your handling code here:
        Dashboard.setVisible(false);
        Inventory.setVisible(false);
        SalesMonitoring.setVisible(false);
        RoleManagement.setVisible(false);
        SystemSettings.setVisible(false);
        AuditLogs.setVisible(true);
    }//GEN-LAST:event_auditlogsActionPerformed

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        // TODO add your handling code here:
        dashboard.setContentAreaFilled(true);
        dashboard.setBackground(new java.awt.Color(111, 68, 54));
        dashboard.setForeground(Color.white);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        // TODO add your handling code here:
        dashboard.setContentAreaFilled(false);
        dashboard.setForeground(Color.white);
    }//GEN-LAST:event_dashboardMouseExited

    private void inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseEntered
        // TODO add your handling code here:
        inventory.setContentAreaFilled(true);
        inventory.setBackground(new java.awt.Color(111, 68, 54));
        inventory.setForeground(Color.white);
    }//GEN-LAST:event_inventoryMouseEntered

    private void inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseExited
        // TODO add your handling code here:
        inventory.setContentAreaFilled(false);
        inventory.setForeground(Color.white);
    }//GEN-LAST:event_inventoryMouseExited

    private void salesmonitoringMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesmonitoringMouseEntered
        // TODO add your handling code here:
        salesmonitoring.setContentAreaFilled(true);
        salesmonitoring.setBackground(new java.awt.Color(111, 68, 54));
        salesmonitoring.setForeground(Color.white);
    }//GEN-LAST:event_salesmonitoringMouseEntered

    private void salesmonitoringMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesmonitoringMouseExited
        // TODO add your handling code here:
        salesmonitoring.setContentAreaFilled(false);
        salesmonitoring.setForeground(Color.white);
    }//GEN-LAST:event_salesmonitoringMouseExited

    private void rolemanagementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolemanagementMouseEntered
        // TODO add your handling code here:
        rolemanagement.setContentAreaFilled(true);
        rolemanagement.setBackground(new java.awt.Color(111, 68, 54));
        rolemanagement.setForeground(Color.white);
    }//GEN-LAST:event_rolemanagementMouseEntered

    private void rolemanagementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolemanagementMouseExited
        // TODO add your handling code here:
        rolemanagement.setContentAreaFilled(false);
        rolemanagement.setForeground(Color.white);
    }//GEN-LAST:event_rolemanagementMouseExited

    private void systemsettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemsettingsMouseEntered
        // TODO add your handling code here:
        systemsettings.setContentAreaFilled(true);
        systemsettings.setBackground(new java.awt.Color(111, 68, 54));
        systemsettings.setForeground(Color.white);
    }//GEN-LAST:event_systemsettingsMouseEntered

    private void systemsettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemsettingsMouseExited
        // TODO add your handling code here:
        systemsettings.setContentAreaFilled(false);
        systemsettings.setForeground(Color.white);
    }//GEN-LAST:event_systemsettingsMouseExited

    private void auditlogsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditlogsMouseEntered
        // TODO add your handling code here:
        auditlogs.setContentAreaFilled(true);
        auditlogs.setBackground(new java.awt.Color(111, 68, 54));
        auditlogs.setForeground(Color.white);
    }//GEN-LAST:event_auditlogsMouseEntered

    private void auditlogsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auditlogsMouseExited
        // TODO add your handling code here:
        auditlogs.setContentAreaFilled(false);
        auditlogs.setForeground(Color.white);
    }//GEN-LAST:event_auditlogsMouseExited

    private void NewAccButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccButMouseEntered
        // TODO add your handling code here:
        NewAccBut.setContentAreaFilled(true);
        NewAccBut.setBackground(new java.awt.Color(111, 68, 54));
        NewAccBut.setForeground(Color.white);
    }//GEN-LAST:event_NewAccButMouseEntered

    private void NewAccButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccButMouseExited
        // TODO add your handling code here:
        NewAccBut.setContentAreaFilled(false);
        NewAccBut.setForeground(Color.white);
    }//GEN-LAST:event_NewAccButMouseExited

    private void ImportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportButtonMouseEntered
        // TODO add your handling code here:
        ImportButton.setContentAreaFilled(true);
        ImportButton.setBackground(new java.awt.Color(111, 68, 54));
        ImportButton.setForeground(Color.white);
    }//GEN-LAST:event_ImportButtonMouseEntered

    private void ImportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportButtonMouseExited
        // TODO add your handling code here:
        ImportButton.setContentAreaFilled(false);
        ImportButton.setForeground(Color.white);
    }//GEN-LAST:event_ImportButtonMouseExited

    private void ConfirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseEntered
        // TODO add your handling code here:
        ConfirmButton.setContentAreaFilled(true);
        ConfirmButton.setBackground(new java.awt.Color(111, 68, 54));
        ConfirmButton.setForeground(Color.white);
    }//GEN-LAST:event_ConfirmButtonMouseEntered

    private void ConfirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseExited
        // TODO add your handling code here:
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setForeground(Color.white);
    }//GEN-LAST:event_ConfirmButtonMouseExited

    private void salesGenReportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesGenReportButtonMouseEntered
        // TODO add your handling code here:
        salesGenReportButton.setContentAreaFilled(true);
        salesGenReportButton.setBackground(new java.awt.Color(111, 68, 54));
        salesGenReportButton.setForeground(Color.white);
    }//GEN-LAST:event_salesGenReportButtonMouseEntered

    private void salesGenReportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesGenReportButtonMouseExited
        // TODO add your handling code here:
        salesGenReportButton.setContentAreaFilled(false);
        salesGenReportButton.setForeground(Color.white);
    }//GEN-LAST:event_salesGenReportButtonMouseExited

    private void cashierGenReportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierGenReportButtonMouseEntered
        // TODO add your handling code here:
        cashierGenReportButton.setContentAreaFilled(true);
        cashierGenReportButton.setBackground(new java.awt.Color(111, 68, 54));
        cashierGenReportButton.setForeground(Color.white);
    }//GEN-LAST:event_cashierGenReportButtonMouseEntered

    private void cashierGenReportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierGenReportButtonMouseExited
        // TODO add your handling code here:
        cashierGenReportButton.setContentAreaFilled(false);
        cashierGenReportButton.setForeground(Color.white);
    }//GEN-LAST:event_cashierGenReportButtonMouseExited

    private void salesFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesFilterButtonActionPerformed
        // TODO add your handling code here:
        filterSalesMonitoringTable(salesField.getText());
    }//GEN-LAST:event_salesFilterButtonActionPerformed

    private void salesGenReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesGenReportButtonActionPerformed

        callSalesReport();
        
    }//GEN-LAST:event_salesGenReportButtonActionPerformed

    private void cashierGenReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierGenReportButtonActionPerformed
        callCashierReport();
        
    }//GEN-LAST:event_cashierGenReportButtonActionPerformed

    // </editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="FUNCTIONALITIES"> 
    
    private void populateRecentSalesTable(){
        DefaultTableModel model = (DefaultTableModel) RecentSalesTable.getModel();
        model.setRowCount(0);
        String url = "jdbc:sqlite:coffeeDB.db";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM SalesByProducts")) {

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                String cashier = rs.getString("Cashier");
                String product = rs.getString("Product");
                String category = rs.getString("Category");
                int sales = rs.getInt("Sales");
                String timestamp = rs.getString("Timestamp");
                model.addRow(new Object[]{cashier, product,category, sales, timestamp});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void populateProductTable(){
        String sqlQuery = "SELECT Product, Price FROM ProductList";
        DefaultTableModel model = (DefaultTableModel) ProductsTable.getModel();
        model.setRowCount(0);
        try {
            sqlPST = conn.prepareStatement(sqlQuery);
            sqlResult = sqlPST.executeQuery();
            while (sqlResult.next()){
                String productString = sqlResult.getString("Product");
                int price = sqlResult.getInt("Price");
                model.addRow(new Object[]{productString, price});
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }
        
    }
    private void callCashierReport(){
        String cashier = salesField.getText().toLowerCase();
        Object comboSelect = salesFilterCombo.getSelectedItem();
        String comboString = comboSelect.toString();
        String cashierName = null;
        
        
        
        if (cashier.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter the name of the cashier ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (comboString.equals("Cashier")){
            // OPEN STAFF PERFORMANCE WINDOW
            String sqlQuery = "SELECT Cashier FROM SalesByProducts WHERE LOWER(Cashier) = ?";
            try {
                    sqlPST = conn.prepareStatement(sqlQuery);
                    sqlPST.setString(1, cashier);
                    sqlResult = sqlPST.executeQuery();
                    while (sqlResult.next()){
                        String resultString = sqlResult.getString("Cashier");
                        if (resultString.toLowerCase().equals(cashier)) {
                            cashierName = sqlResult.getString("Cashier");
                            break;
                        }
                    }
               } catch (SQLException e) {
                   e.printStackTrace();
               }
            
            String cashierFinal = cashierName;
            if (cashierName == null){
                JOptionPane.showMessageDialog(null, "Cashier name not found", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //<editor-fold defaultstate="collapsed" desc="OPEN STAFF PERFORMANCE WINDOW ">
            
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(StaffPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new StaffPerformance(cashierFinal).setVisible(true);
                }
            });
            setVisible(false);
            //</editor-fold>
        } else {
            JOptionPane.showMessageDialog(null, "Please set the combo box to 'Cashier' and put the name of the cashier in the field", "Error in cashier", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }
    private void callSalesReport(){
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport().setVisible(true);
            }
        });
        setVisible(false);
    }
    private void populateRoleManagementTable(){
        DefaultTableModel model = (DefaultTableModel) RoleManagementTable.getModel();
        
        String url = "jdbc:sqlite:coffeeDB.db";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT Name, AccountType FROM Accounts")) {

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                String name = rs.getString("Name");
                String type = rs.getString("AccountType");
                if(type.equals("admin")){
                    type = "ADMINISTRATOR";
                } else if (type.equals("user")){
                    type = "CASHIER";
                }
                model.addRow(new Object[]{name, type});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void populateSalesMonitoringTable(){
        //POPULATES DATA FROM DATABASE TO SALES MONITORING TABLE
        DefaultTableModel model = (DefaultTableModel) SalesMonitoringTable.getModel();
        model.setRowCount(0);
        String url = "jdbc:sqlite:coffeeDB.db";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM SalesByProducts")) {

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                String cashier = rs.getString("Cashier");
                String product = rs.getString("Product");
                String category = rs.getString("Category");
                int sales = rs.getInt("Sales");
                String timestamp = rs.getString("Timestamp");
                model.addRow(new Object[]{cashier, product,category, sales, timestamp});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void populateIngredientsListTable(){
        //POPULATES DATA FROM DATABASE TO INGREDIENTS LIST TABLE
        DefaultTableModel model = (DefaultTableModel) IngredientsTable.getModel();
        
        String url = "jdbc:sqlite:coffeeDB.db";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM IngredientList")) {

            // Iterate through the result set and add rows to the table model
            while (rs.next()) {
                String ingredient = rs.getString("Ingredient");
                int amount = rs.getInt("Amount");
                model.addRow(new Object[]{ingredient, amount});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void filterSalesMonitoringTable(String field){
        DefaultTableModel model = (DefaultTableModel) SalesMonitoringTable.getModel();
        Object comboSelect = salesFilterCombo.getSelectedItem();
        String comboString = comboSelect.toString();
        String fieldLower = field.toLowerCase();
        String sqlQuery;
        model.setRowCount(0);
        
        switch (comboString){
            case "Cashier":
                sqlQuery = "SELECT * FROM SalesByProducts WHERE LOWER(Cashier) = ?";
                try {
                    sqlPST = conn.prepareStatement(sqlQuery);
                    sqlPST.setString(1, fieldLower);
                    sqlResult = sqlPST.executeQuery();
                    while (sqlResult.next()){
                        String cashier = sqlResult.getString("Cashier");
                        String product = sqlResult.getString("Product");
                        String category = sqlResult.getString("Category");
                        int sales = sqlResult.getInt("Sales");
                        String timestamp = sqlResult.getString("Timestamp");
                        model.addRow(new Object[]{cashier, product,category, sales, timestamp});
                    }
               } catch (SQLException e) {
                   e.printStackTrace();
               }
                break;
            case "Product":
                sqlQuery = "SELECT * FROM SalesByProducts WHERE LOWER(Product) = ?";
                try {
                    sqlPST = conn.prepareStatement(sqlQuery);
                    sqlPST.setString(1, fieldLower);
                    sqlResult = sqlPST.executeQuery();
                    while (sqlResult.next()){
                        String cashier = sqlResult.getString("Cashier");
                        String product = sqlResult.getString("Product");
                        String category = sqlResult.getString("Category");
                        int sales = sqlResult.getInt("Sales");
                        String timestamp = sqlResult.getString("Timestamp");
                        model.addRow(new Object[]{cashier, product,category, sales, timestamp});
                    }
               } catch (SQLException e) {
                   e.printStackTrace();
               }
                break;
            case "Category":
                sqlQuery = "SELECT * FROM SalesByProducts WHERE LOWER(Category) = ?";
                try {
                    sqlPST = conn.prepareStatement(sqlQuery);
                    sqlPST.setString(1, fieldLower);
                    sqlResult = sqlPST.executeQuery();
                    while (sqlResult.next()){
                        String cashier = sqlResult.getString("Cashier");
                        String product = sqlResult.getString("Product");
                        String category = sqlResult.getString("Category");
                        int sales = sqlResult.getInt("Sales");
                        String timestamp = sqlResult.getString("Timestamp");
                        model.addRow(new Object[]{cashier, product,category, sales, timestamp});
                    }
               } catch (SQLException e) {
                   e.printStackTrace();
               }
                break;
        }
    }
    public void showLineChart(){
        //create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Sales Monitoring","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        // <editor-fold defaultstate="collapsed" desc="LINE CHART TITLE COLOR ADJUSTMENT">    
        // Get the title object
        Title title = linechart.getTitle();
        // Set the font color
        TextTitle textTitle = (TextTitle) title;
        textTitle.setFont(new Font("Segoe", Font.BOLD, 24));
        textTitle.setPaint(Color.WHITE);
        
        linechart.setBackgroundPaint(new java.awt.Color(222, 160, 87));
        //</editor-fold>    

        // <editor-fold defaultstate="collapsed" desc="CHART PLOT AND LINE RENDERER">
        //create plot object
        org.jfree.chart.plot.CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundAlpha(0.8f);
        lineCategoryPlot.setBackgroundPaint(new java.awt.Color(206, 148, 97));
        
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="LINE CHART AXIS COLOR ADJUSTMENT"> 
        CategoryAxis domainAxis = lineCategoryPlot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) lineCategoryPlot.getRangeAxis();

        // Set the font color for x-axis labels
        domainAxis.setLabelFont(new Font("Segoe", Font.PLAIN, 20));
        domainAxis.setLabelPaint(Color.WHITE);

        // Set the font color for y-axis labels
        rangeAxis.setLabelFont(new Font("Segoe", Font.PLAIN, 20));
        rangeAxis.setLabelPaint(Color.WHITE);

        // Set the font color for tick labels
        domainAxis.setTickLabelFont(new Font("Segoe", Font.PLAIN, 15));
        domainAxis.setTickLabelPaint(Color.WHITE);
        rangeAxis.setTickLabelFont(new Font("Segoe", Font.PLAIN, 15));
        rangeAxis.setTickLabelPaint(Color.WHITE);
        
        //</editor-fold>
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        lineChartPanel.setBackground(new Color(206, 148, 97));
        LineChart.removeAll();
        LineChart.add(lineChartPanel, BorderLayout.CENTER);
        LineChart.validate();
    }
    
    // </editor-fold> 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="VARIABLES"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AuditLogs;
    private javax.swing.JTable AuditLogsTable;
    private javax.swing.JLabel Background;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JButton ImportButton;
    private javax.swing.JScrollPane IngredientsScrPane;
    private javax.swing.JTable IngredientsTable;
    private javax.swing.JPanel Inventory;
    private javax.swing.JPanel LineChart;
    private javax.swing.JButton NewAccBut;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JLabel ProgrammablePhoto;
    private javax.swing.JTable RecentSalesTable;
    private javax.swing.JPanel RoleManagement;
    private javax.swing.JTable RoleManagementTable;
    private javax.swing.JPanel SalesMonitoring;
    private javax.swing.JTable SalesMonitoringTable;
    private javax.swing.JPanel SystemSettings;
    private javax.swing.JButton auditlogs;
    private javax.swing.JButton cashierGenReportButton;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton inventory;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JScrollPane productsScrPane;
    private javax.swing.JButton rolemanagement;
    private javax.swing.JTextField salesField;
    private javax.swing.JButton salesFilterButton;
    private javax.swing.JComboBox<String> salesFilterCombo;
    private javax.swing.JButton salesGenReportButton;
    private javax.swing.JButton salesShowAllButton;
    private javax.swing.JButton salesmonitoring;
    private javax.swing.JButton systemsettings;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}

