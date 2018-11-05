package com.zlf.practice.test;

import com.alibaba.fastjson.JSON;
import com.zlf.practice.entity.SystemClearingConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignUpTest {

    public static final String Uuid = "financialContractUuid";

    public static final String merId = "merId";

    public static final String sql = "INSERT INTO `financial_contract_configuration` (`uuid`, `financial_contract_uuid`, `code`, `content`)\n" +
            "VALUES\n" +
            "\t(UUID(), 'financialContractUuid', '0005', '{\\\"userName\\\":\\\"merId04\\\",\\\"userPass\\\":\\\"111111\\\",\\\"requestUrl\\\":\\\"https://tlt.allinpay.com/aipg/ProcessServlet\\\",\\\"merchantId\\\":\\\"merId\\\",\\\"pathPfx\\\":\\\"/home/web/sign-up/cert/merId04.p12\\\",\\\"cerFile\\\":\\\"/home/web/sign-up/cert/allinpay-pds.cer\\\",\\\"pass\\\":\\\"111111\\\",\\\"paymentInstitution\\\":\\\"11\\\",\\\"payType\\\":\\\"B2C\\\"}');";

    public static Map<String,String>  merIdWithContractNo= new HashMap(){{
        put("200421000009184",	"AVICTC2016X1013");
        put("200421000009183",	"AVICTC2016X0132");
        put("200421000009182",	"AVICTC2017X1401");
        put("200421000009181",	"AVICTC2017X1317");
        put("200421000009180",	"AVICTC2017X0964");
        put("200421000009179",	"AVICTC2017X0848");
        put("200421000009178",	"AVICTC2017X0795");
        put("200421000009177",	"AVICTC2017X0728");
        put("200421000009176",	"AVICTC2017X0687");
        put("200421000009175",	"AVICTC2016X1146");
        put("200421000009174",	"AVICTC2016X0783");
        put("200421000009173",	"AVICTC2016X0678");
        put("200421000009172",	"AVICTC2016X0520");
        put("200421000009171",	"AVICTC2016X0519");
        put("200421000009170",	"AVICTC2018X0113");
        put("200421000009169",	"AVICTC2017X1191");
        put("200421000009168",	"AVICTC2016X0871");
        put("200421000009167",	"AVICTC2017X0618");
        put("200421000009166",	"AVICTC2017X0544");
        put("200421000009165",	"AVICTC2017X0486");
        put("200421000009164",	"AVICTC2017X0474");
        put("200421000009163",	"AVICTC2017X0397");
        put("200421000009162",	"AVICTC2018X0349");
        put("200421000009160",	"AVICTC2016X0547");
        put("200421000009159",	"AVICTC2017X0617");
    }};


    public static final Map<String,String> contractNoWithFinancialUuid = new HashMap(){{
        put("AVICTC2016X0783",	"c4c2df42-df67-41cc-b857-5cc4aa3a1340");
        put("AVICTC2017X1191",	"901ca2a2-b54b-481f-a171-c9411c75da5c");
        put("AVICTC2016X0547",	"441b371d-5697-4c55-9526-b8cc1891fded");
        put("AVICTC2016X1013",	"d39b863c-6f64-42a7-9277-1fbd614b031c");
        put("AVICTC2016X0871",	"3f000a7a-7786-46c5-b24a-1198ec74adeb");
        put("AVICTC2016X0132",	"3bb700a7-b05f-4b71-bba6-1c4ed237967e");
        put("AVICTC2016X0678",	"5bd4b8f1-5c49-45c1-9587-b125a6f49fbb");
        put("AVICTC2016X0519",	"6c9e3bc6-6281-4070-a8a4-b72c2697a169");
        put("AVICTC2016X0520",	"b465670b-db15-4292-b2c4-0154978a6699");
        put("AVICTC2016X1146",	"3727c9dc-befe-4575-96cb-bcd0471c45cb");
        put("AVICTC2017X0397",	"0234abd7-d6ae-4d70-b755-85f48517be42");
        put("AVICTC2017X0544",	"df62e52a-b810-4428-bd81-1970c7fb5fec");
        put("AVICTC2017X0486",	"7d6ac185-a5ec-4728-9262-dfeded94ce36");
        put("AVICTC2017X0728",	"b5ea913b-1d3b-4186-ac30-b791bb377c45");
        put("AVICTC2017X0618",	"84debe5a-cd01-45b8-a414-5b70ae435d79");
        put("AVICTC2017X0795",	"749d5726-cdfb-4127-abc3-290a65087162");
        put("AVICTC2017X0848",	"d33df4ab-a852-43d8-96d7-4916c3b57b73");
        put("AVICTC2017X0474",	"d8f2a55d-8485-43ab-9932-83c961d93744");
        put("AVICTC2017X0964",	"f364c257-402d-4e38-aebf-ebe5bed400da");
        put("AVICTC2017X1317",	"57133d90-d833-4452-8de5-da43087361fd");
        put("AVICTC2017X1401",	"7fd3f53a-5ba5-45fa-b60f-376af264eb12");
        put("AVICTC2018X0113",	"f835f753-3506-4473-b5ba-f72b7fb8ab37");
        put("AVICTC2018X0349",	"b1852d8a-c2ce-4b5d-a1de-1f5b530d782f");
    }};

    public static void main(String[] args){

//        int count = 0;
//        for (Map.Entry<String,String> entry:contractNoWithFinancialUuid.entrySet()){
//            String contractNo = entry.getKey();
//            String financialcontractuuid = entry.getValue();
//            for (Map.Entry<String,String> entryinMerId:merIdWithContractNo.entrySet()){
//                String contractNoinMerId = entryinMerId.getValue();
//                String merIdInMerId = entryinMerId.getKey();
//
//                if (contractNo.equals(contractNoinMerId)){
//                    String sqlInReplace = sql.replace(Uuid,financialcontractuuid);
//                    String sqlWillOut = sqlInReplace.replace(merId,merIdInMerId);
//                    System.out.println(sqlWillOut);
//                    ++count;
//                }
//
//            }
//        }
//
//        System.out.println("count========"+count);


        List<String> al =new ArrayList(){{add("123");add("456");}};

        SystemClearingConfig config = new SystemClearingConfig();
        config.setClearingAccountNo(al);
        config.setClearingDay(10);

        String a = JSON.toJSONString(config);

        System.out.println(a);

        SystemClearingConfig config1 = JSON.parseObject(a,SystemClearingConfig.class);

    }
}
