package com.naichuan.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 张乃川
 * @date 2021/7/21 15:06
 * @deprecated For test purpose only. This class can be ignored.
 */
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalaryPayroll implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 导入序列号
     */
    private String serial_number;

    /**
     * 个人编号
     */
    private String jobno;

    /**
     * 在职状态（1：在职、2：离职）
     */
    private String empstatus;

    /**
     * 所属分公司id
     */
    private String branchid;

    /**
     * 工作部门
     */
    private String orgid;

    /**
     * 岗位id
     */
    private String postid;

    /**
     * 扣税选择：1：正常扣除、2：缓扣
     */
    private String tax_type;

    /**
     * 生效月份
     */
    private Date effective_month;

    /**
     * 薪酬年月
     */
    private Date salary_month;

    /**
     * 核算时是否已经提取过工资：1：是、0：否
     */
    private String is_draw;

    /**
     * 预扣项目合计值
     */
    private BigDecimal ykxm_total;

    /**
     * 税后项目合计值
     */
    private BigDecimal shxm_total;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 修改人
     */
    private String lastmodified;

    /**
     * 修改时间
     */
    private Date lastmodify_time;

    /**
     * 删除状态：1：正常、0：已删除
     */
    private String state;

    /**
     * 导入状态：0：导入失败、1：导入成功
     */
    private String import_state;

    /**
     * 系统提取项：工号
     */
    private String field1;

    /**
     * 系统提取项：姓名
     */
    private String field2;

    /**
     * 系统提取项：身份证号
     */
    private String field3;

    /**
     * 系统提取项：银行卡号
     */
    private String field4;

    /**
     * 系统提取项：在职状态（1：在职、2：离职）
     */
    private String field5;

    /**
     * 系统提取项：入职日期
     */
    private Date field6;

    /**
     * 系统提取项：离职日期
     */
    private Date field7;

    /**
     * 系统提取项：部门
     */
    private String field9;

    /**
     *
     */
    private String field10;

    /**
     *
     */
    private BigDecimal field12;

    /**
     *
     */
    private BigDecimal field13;

    /**
     *
     */
    private BigDecimal field14;

    /**
     *
     */
    private BigDecimal field15;

    /**
     *
     */
    private BigDecimal field16;

    /**
     *
     */
    private BigDecimal field17;

    /**
     *
     */
    private BigDecimal field18;

    /**
     *
     */
    private BigDecimal field19;

    /**
     *
     */
    private BigDecimal field20;

    /**
     *
     */
    private BigDecimal field21;

    /**
     *
     */
    private BigDecimal field22;

    /**
     *
     */
    private BigDecimal field23;

    /**
     *
     */
    private BigDecimal field24;

    /**
     *
     */
    private BigDecimal field25;

    /**
     *
     */
    private BigDecimal field26;

    /**
     *
     */
    private BigDecimal field27;

    /**
     *
     */
    private BigDecimal field28;

    /**
     *
     */
    private String field30;

    /**
     *
     */
    private BigDecimal field31;

    /**
     *
     */
    private BigDecimal field32;

    /**
     *
     */
    private BigDecimal field33;

    /**
     *
     */
    private BigDecimal field34;

    /**
     *
     */
    private BigDecimal field35;

    /**
     *
     */
    private BigDecimal field36;

    /**
     *
     */
    private BigDecimal field37;

    /**
     *
     */
    private BigDecimal field39;

    /**
     *
     */
    private BigDecimal field38;

    /**
     *
     */
    private BigDecimal field40;

    /**
     *
     */
    private BigDecimal field41;

    /**
     *
     */
    private BigDecimal field42;

    /**
     *
     */
    private BigDecimal field43;

    /**
     *
     */
    private BigDecimal field44;

    /**
     *
     */
    private BigDecimal field45;

    /**
     *
     */
    private BigDecimal field46;

    /**
     *
     */
    private BigDecimal field47;

    /**
     *
     */
    private BigDecimal field48;

    /**
     *
     */
    private BigDecimal field49;

    /**
     *
     */
    private BigDecimal field50;

    /**
     *
     */
    private BigDecimal field51;

    /**
     *
     */
    private BigDecimal field52;

    /**
     *
     */
    private BigDecimal field53;

    /**
     *
     */
    private BigDecimal field54;

    /**
     *
     */
    private BigDecimal field55;

    /**
     *
     */
    private BigDecimal field56;

    /**
     *
     */
    private BigDecimal field57;

    /**
     *
     */
    private BigDecimal field58;

    /**
     *
     */
    private BigDecimal field59;

    /**
     *
     */
    private BigDecimal field60;

    /**
     *
     */
    private BigDecimal field61;

    /**
     *
     */
    private BigDecimal field62;

    /**
     *
     */
    private BigDecimal field63;

    /**
     *
     */
    private BigDecimal field64;

    /**
     *
     */
    private BigDecimal field65;

    /**
     *
     */
    private BigDecimal field66;

    /**
     *
     */
    private BigDecimal field70;

    /**
     *
     */
    private BigDecimal field71;

    /**
     *
     */
    private BigDecimal field72;

    /**
     *
     */
    private BigDecimal field73;

    /**
     *
     */
    private BigDecimal field74;

    /**
     *
     */
    private BigDecimal field75;

    /**
     *
     */
    private BigDecimal field76;

    /**
     *
     */
    private BigDecimal field77;

    /**
     *
     */
    private BigDecimal field78;

    /**
     *
     */
    private BigDecimal field79;

    /**
     *
     */
    private BigDecimal field80;

    /**
     *
     */
    private BigDecimal field81;

    /**
     *
     */
    private BigDecimal field82;

    /**
     *
     */
    private BigDecimal field83;

    /**
     *
     */
    private BigDecimal field84;

    /**
     *
     */
    private BigDecimal field85;

    /**
     *
     */
    private BigDecimal field86;

    /**
     *
     */
    private BigDecimal field87;

    /**
     *
     */
    private BigDecimal field88;

    /**
     *
     */
    private BigDecimal field89;

    /**
     *
     */
    private BigDecimal field90;

    /**
     *
     */
    private BigDecimal field91;

    /**
     *
     */
    private BigDecimal field92;

    /**
     *
     */
    private BigDecimal field94;

    /**
     *
     */
    private BigDecimal field95;

    /**
     *
     */
    private BigDecimal field96;

    /**
     *
     */
    private BigDecimal field97;

    /**
     *
     */
    private BigDecimal field98;

    /**
     *
     */
    private BigDecimal field99;

    /**
     * 异常原因
     */
    private String reason;

    /**
     *
     */
    private BigDecimal field100;

    /**
     *
     */
    private BigDecimal field101;

    /**
     *
     */
    private BigDecimal field102;

    /**
     *
     */
    private BigDecimal field103;

    /**
     *
     */
    private BigDecimal field104;

    /**
     *
     */
    private BigDecimal field105;

    /**
     *
     */
    private BigDecimal field106;

    /**
     *
     */
    private BigDecimal field107;

    /**
     *
     */
    private BigDecimal field108;

    /**
     *
     */
    private BigDecimal field109;

    /**
     *
     */
    private BigDecimal field110;

    /**
     *
     */
    private BigDecimal field111;

    /**
     *
     */
    private BigDecimal field112;

    /**
     *
     */
    private BigDecimal field113;

    /**
     *
     */
    private BigDecimal field114;

    /**
     *
     */
    private BigDecimal field115;

    /**
     *
     */
    private BigDecimal field116;

    /**
     *
     */
    private BigDecimal field117;

    /**
     *
     */
    private BigDecimal field118;

    /**
     *
     */
    private BigDecimal field119;

    /**
     *
     */
    private BigDecimal field120;

    /**
     *
     */
    private BigDecimal field121;

    /**
     *
     */
    private BigDecimal field122;

    /**
     *
     */
    private BigDecimal field123;

    /**
     *
     */
    private BigDecimal field124;

    /**
     *
     */
    private BigDecimal field125;

    /**
     *
     */
    private BigDecimal field126;

    /**
     *
     */
    private BigDecimal field127;

    /**
     *
     */
    private BigDecimal field128;

    /**
     *
     */
    private BigDecimal field129;

    /**
     *
     */
    private BigDecimal field130;

    /**
     *
     */
    private BigDecimal field131;

    /**
     *
     */
    private BigDecimal field132;

    /**
     *
     */
    private BigDecimal field133;

    /**
     *
     */
    private BigDecimal field134;

    /**
     *
     */
    private BigDecimal field135;

    /**
     *
     */
    private BigDecimal field136;

    /**
     *
     */
    private BigDecimal field137;

    /**
     *
     */
    private BigDecimal field138;

    /**
     *
     */
    private BigDecimal field139;

    /**
     *
     */
    private BigDecimal field140;

    /**
     *
     */
    private BigDecimal field141;

    /**
     *
     */
    private BigDecimal field142;

    /**
     *
     */
    private BigDecimal field143;

    /**
     *
     */
    private BigDecimal field144;

    /**
     *
     */
    private BigDecimal field145;

    /**
     *
     */
    private BigDecimal field146;

    /**
     *
     */
    private String field147;

    /**
     *
     */
    private BigDecimal field148;

    /**
     *
     */
    private BigDecimal field149;

    /**
     *
     */
    private BigDecimal field150;

    /**
     *
     */
    private BigDecimal field151;

    /**
     *
     */
    private BigDecimal field152;

    /**
     *
     */
    private BigDecimal field153;

    /**
     *
     */
    private BigDecimal field154;

    /**
     *
     */
    private BigDecimal field155;

    /**
     *
     */
    private BigDecimal field156;

    /**
     *
     */
    private BigDecimal field157;

    /**
     *
     */
    private BigDecimal field158;

    /**
     *
     */
    private BigDecimal field159;

    /**
     *
     */
    private BigDecimal field160;

    /**
     *
     */
    private BigDecimal field161;

    /**
     *
     */
    private BigDecimal field162;

    /**
     *
     */
    private BigDecimal field163;

    /**
     *
     */
    private BigDecimal field164;

    /**
     *
     */
    private BigDecimal field165;

    /**
     *
     */
    private BigDecimal field166;

    /**
     *
     */
    private BigDecimal field167;

    /**
     *
     */
    private BigDecimal field168;

    /**
     *
     */
    private BigDecimal field169;

    /**
     *
     */
    private BigDecimal field170;

    /**
     *
     */
    private BigDecimal field171;

    /**
     *
     */
    private BigDecimal field172;

    /**
     *
     */
    private BigDecimal field173;

    /**
     *
     */
    private BigDecimal field174;

    /**
     *
     */
    private BigDecimal field175;

    /**
     *
     */
    private BigDecimal field176;

    /**
     *
     */
    private BigDecimal field177;

    /**
     *
     */
    private BigDecimal field178;

    /**
     *
     */
    private BigDecimal field179;

    /**
     *
     */
    private BigDecimal field180;

    /**
     *
     */
    private BigDecimal field181;

    /**
     *
     */
    private BigDecimal field182;

    /**
     *
     */
    private BigDecimal field183;

    /**
     *
     */
    private String field184;

    /**
     *
     */
    private String field185;

    /**
     *
     */
    private String field186;

    /**
     *
     */
    private String field187;

    /**
     *
     */
    private String field188;

    /**
     *
     */
    private String field189;

    /**
     *
     */
    private String field190;

    /**
     *
     */
    private BigDecimal field191;

    /**
     *
     */
    private BigDecimal field192;

    /**
     *
     */
    private BigDecimal field193;

    /**
     *
     */
    private BigDecimal field194;

    /**
     * 派遣类型编码
     */
    private String sendtype;

    /**
     * 派遣类型名称：A：外包、C：派遣
     */
    private String sendtypename;

    /**
     * 岗位类型id
     */
    private String posttype;

    /**
     * 岗位类型名称
     */
    private String posttypename;

    /**
     * 成本中心id（浪潮核算部门编码）
     */
    private String cost_center;

    /**
     * 成本中心简称
     */
    private String cost_center_name;

    /**
     * 成本中心全称
     */
    private String full_cost_center_name;

    /**
     * 浪潮组织结构编码
     */
    private String financial_org;

    /**
     * 浪潮组织结构名称
     */
    private String financial_orgname;

    /**
     * 项目编码
     */
    private String projectno;

    /**
     * 项目名称
     */
    private String projectname;

    /**
     * 重点关注标记：0：无、1：有
     */
    private String focus_flag;

    /**
     * 甲方客户code
     */
    private String servicecode;

    /**
     * 甲方客户
     */
    private String serviceorg;

    /**
     * 甲方客户详细
     */
    private String serviceorg_detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno;
    }

    public String getEmpstatus() {
        return empstatus;
    }

    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getTax_type() {
        return tax_type;
    }

    public void setTax_type(String tax_type) {
        this.tax_type = tax_type;
    }

    public Date getEffective_month() {
        return effective_month;
    }

    public void setEffective_month(Date effective_month) {
        this.effective_month = effective_month;
    }

    public Date getSalary_month() {
        return salary_month;
    }

    public void setSalary_month(Date salary_month) {
        this.salary_month = salary_month;
    }

    public String getIs_draw() {
        return is_draw;
    }

    public void setIs_draw(String is_draw) {
        this.is_draw = is_draw;
    }

    public BigDecimal getYkxm_total() {
        return ykxm_total;
    }

    public void setYkxm_total(BigDecimal ykxm_total) {
        this.ykxm_total = ykxm_total;
    }

    public BigDecimal getShxm_total() {
        return shxm_total;
    }

    public void setShxm_total(BigDecimal shxm_total) {
        this.shxm_total = shxm_total;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(String lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Date getLastmodify_time() {
        return lastmodify_time;
    }

    public void setLastmodify_time(Date lastmodify_time) {
        this.lastmodify_time = lastmodify_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImport_state() {
        return import_state;
    }

    public void setImport_state(String import_state) {
        this.import_state = import_state;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public Date getField6() {
        return field6;
    }

    public void setField6(Date field6) {
        this.field6 = field6;
    }

    public Date getField7() {
        return field7;
    }

    public void setField7(Date field7) {
        this.field7 = field7;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public BigDecimal getField12() {
        return field12;
    }

    public void setField12(BigDecimal field12) {
        this.field12 = field12;
    }

    public BigDecimal getField13() {
        return field13;
    }

    public void setField13(BigDecimal field13) {
        this.field13 = field13;
    }

    public BigDecimal getField14() {
        return field14;
    }

    public void setField14(BigDecimal field14) {
        this.field14 = field14;
    }

    public BigDecimal getField15() {
        return field15;
    }

    public void setField15(BigDecimal field15) {
        this.field15 = field15;
    }

    public BigDecimal getField16() {
        return field16;
    }

    public void setField16(BigDecimal field16) {
        this.field16 = field16;
    }

    public BigDecimal getField17() {
        return field17;
    }

    public void setField17(BigDecimal field17) {
        this.field17 = field17;
    }

    public BigDecimal getField18() {
        return field18;
    }

    public void setField18(BigDecimal field18) {
        this.field18 = field18;
    }

    public BigDecimal getField19() {
        return field19;
    }

    public void setField19(BigDecimal field19) {
        this.field19 = field19;
    }

    public BigDecimal getField20() {
        return field20;
    }

    public void setField20(BigDecimal field20) {
        this.field20 = field20;
    }

    public BigDecimal getField21() {
        return field21;
    }

    public void setField21(BigDecimal field21) {
        this.field21 = field21;
    }

    public BigDecimal getField22() {
        return field22;
    }

    public void setField22(BigDecimal field22) {
        this.field22 = field22;
    }

    public BigDecimal getField23() {
        return field23;
    }

    public void setField23(BigDecimal field23) {
        this.field23 = field23;
    }

    public BigDecimal getField24() {
        return field24;
    }

    public void setField24(BigDecimal field24) {
        this.field24 = field24;
    }

    public BigDecimal getField25() {
        return field25;
    }

    public void setField25(BigDecimal field25) {
        this.field25 = field25;
    }

    public BigDecimal getField26() {
        return field26;
    }

    public void setField26(BigDecimal field26) {
        this.field26 = field26;
    }

    public BigDecimal getField27() {
        return field27;
    }

    public void setField27(BigDecimal field27) {
        this.field27 = field27;
    }

    public BigDecimal getField28() {
        return field28;
    }

    public void setField28(BigDecimal field28) {
        this.field28 = field28;
    }

    public String getField30() {
        return field30;
    }

    public void setField30(String field30) {
        this.field30 = field30;
    }

    public BigDecimal getField31() {
        return field31;
    }

    public void setField31(BigDecimal field31) {
        this.field31 = field31;
    }

    public BigDecimal getField32() {
        return field32;
    }

    public void setField32(BigDecimal field32) {
        this.field32 = field32;
    }

    public BigDecimal getField33() {
        return field33;
    }

    public void setField33(BigDecimal field33) {
        this.field33 = field33;
    }

    public BigDecimal getField34() {
        return field34;
    }

    public void setField34(BigDecimal field34) {
        this.field34 = field34;
    }

    public BigDecimal getField35() {
        return field35;
    }

    public void setField35(BigDecimal field35) {
        this.field35 = field35;
    }

    public BigDecimal getField36() {
        return field36;
    }

    public void setField36(BigDecimal field36) {
        this.field36 = field36;
    }

    public BigDecimal getField37() {
        return field37;
    }

    public void setField37(BigDecimal field37) {
        this.field37 = field37;
    }

    public BigDecimal getField39() {
        return field39;
    }

    public void setField39(BigDecimal field39) {
        this.field39 = field39;
    }

    public BigDecimal getField38() {
        return field38;
    }

    public void setField38(BigDecimal field38) {
        this.field38 = field38;
    }

    public BigDecimal getField40() {
        return field40;
    }

    public void setField40(BigDecimal field40) {
        this.field40 = field40;
    }

    public BigDecimal getField41() {
        return field41;
    }

    public void setField41(BigDecimal field41) {
        this.field41 = field41;
    }

    public BigDecimal getField42() {
        return field42;
    }

    public void setField42(BigDecimal field42) {
        this.field42 = field42;
    }

    public BigDecimal getField43() {
        return field43;
    }

    public void setField43(BigDecimal field43) {
        this.field43 = field43;
    }

    public BigDecimal getField44() {
        return field44;
    }

    public void setField44(BigDecimal field44) {
        this.field44 = field44;
    }

    public BigDecimal getField45() {
        return field45;
    }

    public void setField45(BigDecimal field45) {
        this.field45 = field45;
    }

    public BigDecimal getField46() {
        return field46;
    }

    public void setField46(BigDecimal field46) {
        this.field46 = field46;
    }

    public BigDecimal getField47() {
        return field47;
    }

    public void setField47(BigDecimal field47) {
        this.field47 = field47;
    }

    public BigDecimal getField48() {
        return field48;
    }

    public void setField48(BigDecimal field48) {
        this.field48 = field48;
    }

    public BigDecimal getField49() {
        return field49;
    }

    public void setField49(BigDecimal field49) {
        this.field49 = field49;
    }

    public BigDecimal getField50() {
        return field50;
    }

    public void setField50(BigDecimal field50) {
        this.field50 = field50;
    }

    public BigDecimal getField51() {
        return field51;
    }

    public void setField51(BigDecimal field51) {
        this.field51 = field51;
    }

    public BigDecimal getField52() {
        return field52;
    }

    public void setField52(BigDecimal field52) {
        this.field52 = field52;
    }

    public BigDecimal getField53() {
        return field53;
    }

    public void setField53(BigDecimal field53) {
        this.field53 = field53;
    }

    public BigDecimal getField54() {
        return field54;
    }

    public void setField54(BigDecimal field54) {
        this.field54 = field54;
    }

    public BigDecimal getField55() {
        return field55;
    }

    public void setField55(BigDecimal field55) {
        this.field55 = field55;
    }

    public BigDecimal getField56() {
        return field56;
    }

    public void setField56(BigDecimal field56) {
        this.field56 = field56;
    }

    public BigDecimal getField57() {
        return field57;
    }

    public void setField57(BigDecimal field57) {
        this.field57 = field57;
    }

    public BigDecimal getField58() {
        return field58;
    }

    public void setField58(BigDecimal field58) {
        this.field58 = field58;
    }

    public BigDecimal getField59() {
        return field59;
    }

    public void setField59(BigDecimal field59) {
        this.field59 = field59;
    }

    public BigDecimal getField60() {
        return field60;
    }

    public void setField60(BigDecimal field60) {
        this.field60 = field60;
    }

    public BigDecimal getField61() {
        return field61;
    }

    public void setField61(BigDecimal field61) {
        this.field61 = field61;
    }

    public BigDecimal getField62() {
        return field62;
    }

    public void setField62(BigDecimal field62) {
        this.field62 = field62;
    }

    public BigDecimal getField63() {
        return field63;
    }

    public void setField63(BigDecimal field63) {
        this.field63 = field63;
    }

    public BigDecimal getField64() {
        return field64;
    }

    public void setField64(BigDecimal field64) {
        this.field64 = field64;
    }

    public BigDecimal getField65() {
        return field65;
    }

    public void setField65(BigDecimal field65) {
        this.field65 = field65;
    }

    public BigDecimal getField66() {
        return field66;
    }

    public void setField66(BigDecimal field66) {
        this.field66 = field66;
    }

    public BigDecimal getField70() {
        return field70;
    }

    public void setField70(BigDecimal field70) {
        this.field70 = field70;
    }

    public BigDecimal getField71() {
        return field71;
    }

    public void setField71(BigDecimal field71) {
        this.field71 = field71;
    }

    public BigDecimal getField72() {
        return field72;
    }

    public void setField72(BigDecimal field72) {
        this.field72 = field72;
    }

    public BigDecimal getField73() {
        return field73;
    }

    public void setField73(BigDecimal field73) {
        this.field73 = field73;
    }

    public BigDecimal getField74() {
        return field74;
    }

    public void setField74(BigDecimal field74) {
        this.field74 = field74;
    }

    public BigDecimal getField75() {
        return field75;
    }

    public void setField75(BigDecimal field75) {
        this.field75 = field75;
    }

    public BigDecimal getField76() {
        return field76;
    }

    public void setField76(BigDecimal field76) {
        this.field76 = field76;
    }

    public BigDecimal getField77() {
        return field77;
    }

    public void setField77(BigDecimal field77) {
        this.field77 = field77;
    }

    public BigDecimal getField78() {
        return field78;
    }

    public void setField78(BigDecimal field78) {
        this.field78 = field78;
    }

    public BigDecimal getField79() {
        return field79;
    }

    public void setField79(BigDecimal field79) {
        this.field79 = field79;
    }

    public BigDecimal getField80() {
        return field80;
    }

    public void setField80(BigDecimal field80) {
        this.field80 = field80;
    }

    public BigDecimal getField81() {
        return field81;
    }

    public void setField81(BigDecimal field81) {
        this.field81 = field81;
    }

    public BigDecimal getField82() {
        return field82;
    }

    public void setField82(BigDecimal field82) {
        this.field82 = field82;
    }

    public BigDecimal getField83() {
        return field83;
    }

    public void setField83(BigDecimal field83) {
        this.field83 = field83;
    }

    public BigDecimal getField84() {
        return field84;
    }

    public void setField84(BigDecimal field84) {
        this.field84 = field84;
    }

    public BigDecimal getField85() {
        return field85;
    }

    public void setField85(BigDecimal field85) {
        this.field85 = field85;
    }

    public BigDecimal getField86() {
        return field86;
    }

    public void setField86(BigDecimal field86) {
        this.field86 = field86;
    }

    public BigDecimal getField87() {
        return field87;
    }

    public void setField87(BigDecimal field87) {
        this.field87 = field87;
    }

    public BigDecimal getField88() {
        return field88;
    }

    public void setField88(BigDecimal field88) {
        this.field88 = field88;
    }

    public BigDecimal getField89() {
        return field89;
    }

    public void setField89(BigDecimal field89) {
        this.field89 = field89;
    }

    public BigDecimal getField90() {
        return field90;
    }

    public void setField90(BigDecimal field90) {
        this.field90 = field90;
    }

    public BigDecimal getField91() {
        return field91;
    }

    public void setField91(BigDecimal field91) {
        this.field91 = field91;
    }

    public BigDecimal getField92() {
        return field92;
    }

    public void setField92(BigDecimal field92) {
        this.field92 = field92;
    }

    public BigDecimal getField94() {
        return field94;
    }

    public void setField94(BigDecimal field94) {
        this.field94 = field94;
    }

    public BigDecimal getField95() {
        return field95;
    }

    public void setField95(BigDecimal field95) {
        this.field95 = field95;
    }

    public BigDecimal getField96() {
        return field96;
    }

    public void setField96(BigDecimal field96) {
        this.field96 = field96;
    }

    public BigDecimal getField97() {
        return field97;
    }

    public void setField97(BigDecimal field97) {
        this.field97 = field97;
    }

    public BigDecimal getField98() {
        return field98;
    }

    public void setField98(BigDecimal field98) {
        this.field98 = field98;
    }

    public BigDecimal getField99() {
        return field99;
    }

    public void setField99(BigDecimal field99) {
        this.field99 = field99;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getField100() {
        return field100;
    }

    public void setField100(BigDecimal field100) {
        this.field100 = field100;
    }

    public BigDecimal getField101() {
        return field101;
    }

    public void setField101(BigDecimal field101) {
        this.field101 = field101;
    }

    public BigDecimal getField102() {
        return field102;
    }

    public void setField102(BigDecimal field102) {
        this.field102 = field102;
    }

    public BigDecimal getField103() {
        return field103;
    }

    public void setField103(BigDecimal field103) {
        this.field103 = field103;
    }

    public BigDecimal getField104() {
        return field104;
    }

    public void setField104(BigDecimal field104) {
        this.field104 = field104;
    }

    public BigDecimal getField105() {
        return field105;
    }

    public void setField105(BigDecimal field105) {
        this.field105 = field105;
    }

    public BigDecimal getField106() {
        return field106;
    }

    public void setField106(BigDecimal field106) {
        this.field106 = field106;
    }

    public BigDecimal getField107() {
        return field107;
    }

    public void setField107(BigDecimal field107) {
        this.field107 = field107;
    }

    public BigDecimal getField108() {
        return field108;
    }

    public void setField108(BigDecimal field108) {
        this.field108 = field108;
    }

    public BigDecimal getField109() {
        return field109;
    }

    public void setField109(BigDecimal field109) {
        this.field109 = field109;
    }

    public BigDecimal getField110() {
        return field110;
    }

    public void setField110(BigDecimal field110) {
        this.field110 = field110;
    }

    public BigDecimal getField111() {
        return field111;
    }

    public void setField111(BigDecimal field111) {
        this.field111 = field111;
    }

    public BigDecimal getField112() {
        return field112;
    }

    public void setField112(BigDecimal field112) {
        this.field112 = field112;
    }

    public BigDecimal getField113() {
        return field113;
    }

    public void setField113(BigDecimal field113) {
        this.field113 = field113;
    }

    public BigDecimal getField114() {
        return field114;
    }

    public void setField114(BigDecimal field114) {
        this.field114 = field114;
    }

    public BigDecimal getField115() {
        return field115;
    }

    public void setField115(BigDecimal field115) {
        this.field115 = field115;
    }

    public BigDecimal getField116() {
        return field116;
    }

    public void setField116(BigDecimal field116) {
        this.field116 = field116;
    }

    public BigDecimal getField117() {
        return field117;
    }

    public void setField117(BigDecimal field117) {
        this.field117 = field117;
    }

    public BigDecimal getField118() {
        return field118;
    }

    public void setField118(BigDecimal field118) {
        this.field118 = field118;
    }

    public BigDecimal getField119() {
        return field119;
    }

    public void setField119(BigDecimal field119) {
        this.field119 = field119;
    }

    public BigDecimal getField120() {
        return field120;
    }

    public void setField120(BigDecimal field120) {
        this.field120 = field120;
    }

    public BigDecimal getField121() {
        return field121;
    }

    public void setField121(BigDecimal field121) {
        this.field121 = field121;
    }

    public BigDecimal getField122() {
        return field122;
    }

    public void setField122(BigDecimal field122) {
        this.field122 = field122;
    }

    public BigDecimal getField123() {
        return field123;
    }

    public void setField123(BigDecimal field123) {
        this.field123 = field123;
    }

    public BigDecimal getField124() {
        return field124;
    }

    public void setField124(BigDecimal field124) {
        this.field124 = field124;
    }

    public BigDecimal getField125() {
        return field125;
    }

    public void setField125(BigDecimal field125) {
        this.field125 = field125;
    }

    public BigDecimal getField126() {
        return field126;
    }

    public void setField126(BigDecimal field126) {
        this.field126 = field126;
    }

    public BigDecimal getField127() {
        return field127;
    }

    public void setField127(BigDecimal field127) {
        this.field127 = field127;
    }

    public BigDecimal getField128() {
        return field128;
    }

    public void setField128(BigDecimal field128) {
        this.field128 = field128;
    }

    public BigDecimal getField129() {
        return field129;
    }

    public void setField129(BigDecimal field129) {
        this.field129 = field129;
    }

    public BigDecimal getField130() {
        return field130;
    }

    public void setField130(BigDecimal field130) {
        this.field130 = field130;
    }

    public BigDecimal getField131() {
        return field131;
    }

    public void setField131(BigDecimal field131) {
        this.field131 = field131;
    }

    public BigDecimal getField132() {
        return field132;
    }

    public void setField132(BigDecimal field132) {
        this.field132 = field132;
    }

    public BigDecimal getField133() {
        return field133;
    }

    public void setField133(BigDecimal field133) {
        this.field133 = field133;
    }

    public BigDecimal getField134() {
        return field134;
    }

    public void setField134(BigDecimal field134) {
        this.field134 = field134;
    }

    public BigDecimal getField135() {
        return field135;
    }

    public void setField135(BigDecimal field135) {
        this.field135 = field135;
    }

    public BigDecimal getField136() {
        return field136;
    }

    public void setField136(BigDecimal field136) {
        this.field136 = field136;
    }

    public BigDecimal getField137() {
        return field137;
    }

    public void setField137(BigDecimal field137) {
        this.field137 = field137;
    }

    public BigDecimal getField138() {
        return field138;
    }

    public void setField138(BigDecimal field138) {
        this.field138 = field138;
    }

    public BigDecimal getField139() {
        return field139;
    }

    public void setField139(BigDecimal field139) {
        this.field139 = field139;
    }

    public BigDecimal getField140() {
        return field140;
    }

    public void setField140(BigDecimal field140) {
        this.field140 = field140;
    }

    public BigDecimal getField141() {
        return field141;
    }

    public void setField141(BigDecimal field141) {
        this.field141 = field141;
    }

    public BigDecimal getField142() {
        return field142;
    }

    public void setField142(BigDecimal field142) {
        this.field142 = field142;
    }

    public BigDecimal getField143() {
        return field143;
    }

    public void setField143(BigDecimal field143) {
        this.field143 = field143;
    }

    public BigDecimal getField144() {
        return field144;
    }

    public void setField144(BigDecimal field144) {
        this.field144 = field144;
    }

    public BigDecimal getField145() {
        return field145;
    }

    public void setField145(BigDecimal field145) {
        this.field145 = field145;
    }

    public BigDecimal getField146() {
        return field146;
    }

    public void setField146(BigDecimal field146) {
        this.field146 = field146;
    }

    public String getField147() {
        return field147;
    }

    public void setField147(String field147) {
        this.field147 = field147;
    }

    public BigDecimal getField148() {
        return field148;
    }

    public void setField148(BigDecimal field148) {
        this.field148 = field148;
    }

    public BigDecimal getField149() {
        return field149;
    }

    public void setField149(BigDecimal field149) {
        this.field149 = field149;
    }

    public BigDecimal getField150() {
        return field150;
    }

    public void setField150(BigDecimal field150) {
        this.field150 = field150;
    }

    public BigDecimal getField151() {
        return field151;
    }

    public void setField151(BigDecimal field151) {
        this.field151 = field151;
    }

    public BigDecimal getField152() {
        return field152;
    }

    public void setField152(BigDecimal field152) {
        this.field152 = field152;
    }

    public BigDecimal getField153() {
        return field153;
    }

    public void setField153(BigDecimal field153) {
        this.field153 = field153;
    }

    public BigDecimal getField154() {
        return field154;
    }

    public void setField154(BigDecimal field154) {
        this.field154 = field154;
    }

    public BigDecimal getField155() {
        return field155;
    }

    public void setField155(BigDecimal field155) {
        this.field155 = field155;
    }

    public BigDecimal getField156() {
        return field156;
    }

    public void setField156(BigDecimal field156) {
        this.field156 = field156;
    }

    public BigDecimal getField157() {
        return field157;
    }

    public void setField157(BigDecimal field157) {
        this.field157 = field157;
    }

    public BigDecimal getField158() {
        return field158;
    }

    public void setField158(BigDecimal field158) {
        this.field158 = field158;
    }

    public BigDecimal getField159() {
        return field159;
    }

    public void setField159(BigDecimal field159) {
        this.field159 = field159;
    }

    public BigDecimal getField160() {
        return field160;
    }

    public void setField160(BigDecimal field160) {
        this.field160 = field160;
    }

    public BigDecimal getField161() {
        return field161;
    }

    public void setField161(BigDecimal field161) {
        this.field161 = field161;
    }

    public BigDecimal getField162() {
        return field162;
    }

    public void setField162(BigDecimal field162) {
        this.field162 = field162;
    }

    public BigDecimal getField163() {
        return field163;
    }

    public void setField163(BigDecimal field163) {
        this.field163 = field163;
    }

    public BigDecimal getField164() {
        return field164;
    }

    public void setField164(BigDecimal field164) {
        this.field164 = field164;
    }

    public BigDecimal getField165() {
        return field165;
    }

    public void setField165(BigDecimal field165) {
        this.field165 = field165;
    }

    public BigDecimal getField166() {
        return field166;
    }

    public void setField166(BigDecimal field166) {
        this.field166 = field166;
    }

    public BigDecimal getField167() {
        return field167;
    }

    public void setField167(BigDecimal field167) {
        this.field167 = field167;
    }

    public BigDecimal getField168() {
        return field168;
    }

    public void setField168(BigDecimal field168) {
        this.field168 = field168;
    }

    public BigDecimal getField169() {
        return field169;
    }

    public void setField169(BigDecimal field169) {
        this.field169 = field169;
    }

    public BigDecimal getField170() {
        return field170;
    }

    public void setField170(BigDecimal field170) {
        this.field170 = field170;
    }

    public BigDecimal getField171() {
        return field171;
    }

    public void setField171(BigDecimal field171) {
        this.field171 = field171;
    }

    public BigDecimal getField172() {
        return field172;
    }

    public void setField172(BigDecimal field172) {
        this.field172 = field172;
    }

    public BigDecimal getField173() {
        return field173;
    }

    public void setField173(BigDecimal field173) {
        this.field173 = field173;
    }

    public BigDecimal getField174() {
        return field174;
    }

    public void setField174(BigDecimal field174) {
        this.field174 = field174;
    }

    public BigDecimal getField175() {
        return field175;
    }

    public void setField175(BigDecimal field175) {
        this.field175 = field175;
    }

    public BigDecimal getField176() {
        return field176;
    }

    public void setField176(BigDecimal field176) {
        this.field176 = field176;
    }

    public BigDecimal getField177() {
        return field177;
    }

    public void setField177(BigDecimal field177) {
        this.field177 = field177;
    }

    public BigDecimal getField178() {
        return field178;
    }

    public void setField178(BigDecimal field178) {
        this.field178 = field178;
    }

    public BigDecimal getField179() {
        return field179;
    }

    public void setField179(BigDecimal field179) {
        this.field179 = field179;
    }

    public BigDecimal getField180() {
        return field180;
    }

    public void setField180(BigDecimal field180) {
        this.field180 = field180;
    }

    public BigDecimal getField181() {
        return field181;
    }

    public void setField181(BigDecimal field181) {
        this.field181 = field181;
    }

    public BigDecimal getField182() {
        return field182;
    }

    public void setField182(BigDecimal field182) {
        this.field182 = field182;
    }

    public BigDecimal getField183() {
        return field183;
    }

    public void setField183(BigDecimal field183) {
        this.field183 = field183;
    }

    public String getField184() {
        return field184;
    }

    public void setField184(String field184) {
        this.field184 = field184;
    }

    public String getField185() {
        return field185;
    }

    public void setField185(String field185) {
        this.field185 = field185;
    }

    public String getField186() {
        return field186;
    }

    public void setField186(String field186) {
        this.field186 = field186;
    }

    public String getField187() {
        return field187;
    }

    public void setField187(String field187) {
        this.field187 = field187;
    }

    public String getField188() {
        return field188;
    }

    public void setField188(String field188) {
        this.field188 = field188;
    }

    public String getField189() {
        return field189;
    }

    public void setField189(String field189) {
        this.field189 = field189;
    }

    public String getField190() {
        return field190;
    }

    public void setField190(String field190) {
        this.field190 = field190;
    }

    public BigDecimal getField191() {
        return field191;
    }

    public void setField191(BigDecimal field191) {
        this.field191 = field191;
    }

    public BigDecimal getField192() {
        return field192;
    }

    public void setField192(BigDecimal field192) {
        this.field192 = field192;
    }

    public BigDecimal getField193() {
        return field193;
    }

    public void setField193(BigDecimal field193) {
        this.field193 = field193;
    }

    public BigDecimal getField194() {
        return field194;
    }

    public void setField194(BigDecimal field194) {
        this.field194 = field194;
    }

    public String getSendtype() {
        return sendtype;
    }

    public void setSendtype(String sendtype) {
        this.sendtype = sendtype;
    }

    public String getSendtypename() {
        return sendtypename;
    }

    public void setSendtypename(String sendtypename) {
        this.sendtypename = sendtypename;
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getPosttypename() {
        return posttypename;
    }

    public void setPosttypename(String posttypename) {
        this.posttypename = posttypename;
    }

    public String getCost_center() {
        return cost_center;
    }

    public void setCost_center(String cost_center) {
        this.cost_center = cost_center;
    }

    public String getCost_center_name() {
        return cost_center_name;
    }

    public void setCost_center_name(String cost_center_name) {
        this.cost_center_name = cost_center_name;
    }

    public String getFull_cost_center_name() {
        return full_cost_center_name;
    }

    public void setFull_cost_center_name(String full_cost_center_name) {
        this.full_cost_center_name = full_cost_center_name;
    }

    public String getFinancial_org() {
        return financial_org;
    }

    public void setFinancial_org(String financial_org) {
        this.financial_org = financial_org;
    }

    public String getFinancial_orgname() {
        return financial_orgname;
    }

    public void setFinancial_orgname(String financial_orgname) {
        this.financial_orgname = financial_orgname;
    }

    public String getProjectno() {
        return projectno;
    }

    public void setProjectno(String projectno) {
        this.projectno = projectno;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getFocus_flag() {
        return focus_flag;
    }

    public void setFocus_flag(String focus_flag) {
        this.focus_flag = focus_flag;
    }

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode;
    }

    public String getServiceorg() {
        return serviceorg;
    }

    public void setServiceorg(String serviceorg) {
        this.serviceorg = serviceorg;
    }

    public String getServiceorg_detail() {
        return serviceorg_detail;
    }

    public void setServiceorg_detail(String serviceorg_detail) {
        this.serviceorg_detail = serviceorg_detail;
    }

    @Override
    public String toString() {
        return "SalaryPayroll{" +
                "id=" + id +
                ", serial_number='" + serial_number + '\'' +
                ", jobno='" + jobno + '\'' +
                ", empstatus='" + empstatus + '\'' +
                ", branchid='" + branchid + '\'' +
                ", orgid='" + orgid + '\'' +
                ", postid='" + postid + '\'' +
                ", tax_type='" + tax_type + '\'' +
                ", effective_month=" + effective_month +
                ", salary_month=" + salary_month +
                ", is_draw='" + is_draw + '\'' +
                ", ykxm_total=" + ykxm_total +
                ", shxm_total=" + shxm_total +
                ", creator='" + creator + '\'' +
                ", create_time=" + create_time +
                ", lastmodified='" + lastmodified + '\'' +
                ", lastmodify_time=" + lastmodify_time +
                ", state='" + state + '\'' +
                ", import_state='" + import_state + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                ", field6=" + field6 +
                ", field7=" + field7 +
                ", field9='" + field9 + '\'' +
                ", field10='" + field10 + '\'' +
                ", field12=" + field12 +
                ", field13=" + field13 +
                ", field14=" + field14 +
                ", field15=" + field15 +
                ", field16=" + field16 +
                ", field17=" + field17 +
                ", field18=" + field18 +
                ", field19=" + field19 +
                ", field20=" + field20 +
                ", field21=" + field21 +
                ", field22=" + field22 +
                ", field23=" + field23 +
                ", field24=" + field24 +
                ", field25=" + field25 +
                ", field26=" + field26 +
                ", field27=" + field27 +
                ", field28=" + field28 +
                ", field30='" + field30 + '\'' +
                ", field31=" + field31 +
                ", field32=" + field32 +
                ", field33=" + field33 +
                ", field34=" + field34 +
                ", field35=" + field35 +
                ", field36=" + field36 +
                ", field37=" + field37 +
                ", field39=" + field39 +
                ", field38=" + field38 +
                ", field40=" + field40 +
                ", field41=" + field41 +
                ", field42=" + field42 +
                ", field43=" + field43 +
                ", field44=" + field44 +
                ", field45=" + field45 +
                ", field46=" + field46 +
                ", field47=" + field47 +
                ", field48=" + field48 +
                ", field49=" + field49 +
                ", field50=" + field50 +
                ", field51=" + field51 +
                ", field52=" + field52 +
                ", field53=" + field53 +
                ", field54=" + field54 +
                ", field55=" + field55 +
                ", field56=" + field56 +
                ", field57=" + field57 +
                ", field58=" + field58 +
                ", field59=" + field59 +
                ", field60=" + field60 +
                ", field61=" + field61 +
                ", field62=" + field62 +
                ", field63=" + field63 +
                ", field64=" + field64 +
                ", field65=" + field65 +
                ", field66=" + field66 +
                ", field70=" + field70 +
                ", field71=" + field71 +
                ", field72=" + field72 +
                ", field73=" + field73 +
                ", field74=" + field74 +
                ", field75=" + field75 +
                ", field76=" + field76 +
                ", field77=" + field77 +
                ", field78=" + field78 +
                ", field79=" + field79 +
                ", field80=" + field80 +
                ", field81=" + field81 +
                ", field82=" + field82 +
                ", field83=" + field83 +
                ", field84=" + field84 +
                ", field85=" + field85 +
                ", field86=" + field86 +
                ", field87=" + field87 +
                ", field88=" + field88 +
                ", field89=" + field89 +
                ", field90=" + field90 +
                ", field91=" + field91 +
                ", field92=" + field92 +
                ", field94=" + field94 +
                ", field95=" + field95 +
                ", field96=" + field96 +
                ", field97=" + field97 +
                ", field98=" + field98 +
                ", field99=" + field99 +
                ", reason='" + reason + '\'' +
                ", field100=" + field100 +
                ", field101=" + field101 +
                ", field102=" + field102 +
                ", field103=" + field103 +
                ", field104=" + field104 +
                ", field105=" + field105 +
                ", field106=" + field106 +
                ", field107=" + field107 +
                ", field108=" + field108 +
                ", field109=" + field109 +
                ", field110=" + field110 +
                ", field111=" + field111 +
                ", field112=" + field112 +
                ", field113=" + field113 +
                ", field114=" + field114 +
                ", field115=" + field115 +
                ", field116=" + field116 +
                ", field117=" + field117 +
                ", field118=" + field118 +
                ", field119=" + field119 +
                ", field120=" + field120 +
                ", field121=" + field121 +
                ", field122=" + field122 +
                ", field123=" + field123 +
                ", field124=" + field124 +
                ", field125=" + field125 +
                ", field126=" + field126 +
                ", field127=" + field127 +
                ", field128=" + field128 +
                ", field129=" + field129 +
                ", field130=" + field130 +
                ", field131=" + field131 +
                ", field132=" + field132 +
                ", field133=" + field133 +
                ", field134=" + field134 +
                ", field135=" + field135 +
                ", field136=" + field136 +
                ", field137=" + field137 +
                ", field138=" + field138 +
                ", field139=" + field139 +
                ", field140=" + field140 +
                ", field141=" + field141 +
                ", field142=" + field142 +
                ", field143=" + field143 +
                ", field144=" + field144 +
                ", field145=" + field145 +
                ", field146=" + field146 +
                ", field147='" + field147 + '\'' +
                ", field148=" + field148 +
                ", field149=" + field149 +
                ", field150=" + field150 +
                ", field151=" + field151 +
                ", field152=" + field152 +
                ", field153=" + field153 +
                ", field154=" + field154 +
                ", field155=" + field155 +
                ", field156=" + field156 +
                ", field157=" + field157 +
                ", field158=" + field158 +
                ", field159=" + field159 +
                ", field160=" + field160 +
                ", field161=" + field161 +
                ", field162=" + field162 +
                ", field163=" + field163 +
                ", field164=" + field164 +
                ", field165=" + field165 +
                ", field166=" + field166 +
                ", field167=" + field167 +
                ", field168=" + field168 +
                ", field169=" + field169 +
                ", field170=" + field170 +
                ", field171=" + field171 +
                ", field172=" + field172 +
                ", field173=" + field173 +
                ", field174=" + field174 +
                ", field175=" + field175 +
                ", field176=" + field176 +
                ", field177=" + field177 +
                ", field178=" + field178 +
                ", field179=" + field179 +
                ", field180=" + field180 +
                ", field181=" + field181 +
                ", field182=" + field182 +
                ", field183=" + field183 +
                ", field184='" + field184 + '\'' +
                ", field185='" + field185 + '\'' +
                ", field186='" + field186 + '\'' +
                ", field187='" + field187 + '\'' +
                ", field188='" + field188 + '\'' +
                ", field189='" + field189 + '\'' +
                ", field190='" + field190 + '\'' +
                ", field191=" + field191 +
                ", field192=" + field192 +
                ", field193=" + field193 +
                ", field194=" + field194 +
                ", sendtype='" + sendtype + '\'' +
                ", sendtypename='" + sendtypename + '\'' +
                ", posttype='" + posttype + '\'' +
                ", posttypename='" + posttypename + '\'' +
                ", cost_center='" + cost_center + '\'' +
                ", cost_center_name='" + cost_center_name + '\'' +
                ", full_cost_center_name='" + full_cost_center_name + '\'' +
                ", financial_org='" + financial_org + '\'' +
                ", financial_orgname='" + financial_orgname + '\'' +
                ", projectno='" + projectno + '\'' +
                ", projectname='" + projectname + '\'' +
                ", focus_flag='" + focus_flag + '\'' +
                ", servicecode='" + servicecode + '\'' +
                ", serviceorg='" + serviceorg + '\'' +
                ", serviceorg_detail='" + serviceorg_detail + '\'' +
                '}';
    }
}

