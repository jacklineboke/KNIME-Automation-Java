import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {

    @Test
    public void a_signinpage(){
        HttpResponse<String> response = Unirest.get("https://hub.knime.com/site/login?wdywtg=%2F")
                  .header("Cookie", "knime-hub-sid=s%3ATX5LjT8trb4fXDgJjb2nSubqu5lgVvqL.%2BT7%2B8CemEUGmj0WxaZmDa%2FgBlwMi0ruJI5PRNbkqdkw")
                .asString();

       // System.out.println(response.getBody().toString());
    }

    @Test
    public void b_login(){
        HttpResponse<String> response = Unirest.post("https://www.knime.com/user/login")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Cookie", "SSESSa5f3ee412169ccde5d40c5db871c8784=rSDTw9LWgDhe5M1W62lqWcMIcyCQAxI5P4pdrZLoTufXIQbr")
                .field("name", "JChacha")
                .field("pass", "RoundRobin@2022")
                .field("form_build_id", "form-Qv1lkBbNLFj3qRcDo8Ya0PesOhT5ZC2T7dGfHuqQtOY")
                .field("form_id", "user_login_form")
                .asString();
     //   System.out.println(response.getBody().toString());
    }

    @Test
    public void c_hubauthentication(){
        HttpResponse<String> response = Unirest.get("https://hub.knime.com/")
                .header("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"")
                .header("cookie", "_ga=GA1.2.621586728.1648146691; _gid=GA1.2.1600765859.1648146691; _gcl_au=1.1.415446802.1648153161; _hjSessionUser_1995641=eyJpZCI6ImRkYzllZmFmLTFkZjItNWY3Mi1iMTdhLWU1YzBhYzk0NTFmNCIsImNyZWF0ZWQiOjE2NDgxNTMxNjEwNzcsImV4aXN0aW5nIjpmYWxzZX0=; _hjFirstSeen=1; _hjSession_1995641=eyJpZCI6IjcxZDhlMTUwLWU5NDUtNGQ1OC04MzNlLTg1YjM3NjBjOWNmNiIsImNyZWF0ZWQiOjE2NDgxNTMxNjEyODcsImluU2FtcGxlIjpmYWxzZX0=; _hjAbsoluteSessionInProgress=0; knime-hub-sid=s%3AGj5464JDwJnXxvc-ndyHnkq0WoZKVt-X.QMRyojtwj2CKZ2ziFvkuwoYLCwC6I8rWD8Csztk%2F5LM; _gat_UA-511689-4=1; knime-hub-sid=s%3ATX5LjT8trb4fXDgJjb2nSubqu5lgVvqL.%2BT7%2B8CemEUGmj0WxaZmDa%2FgBlwMi0ruJI5PRNbkqdkw; knime_hub_auth=eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiJjNGFmZGI4YS1jMDRmLTRhOTEtYWM2NC1iZTM1NmQ1NDA1YzUiLCJleHAiOjE2NDgxNjQxOTYsIm5iZiI6MCwiaWF0IjoxNjQ4MTUzMzk2LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiSk04eUFrWUI3dmNSMHk1b2ZmdE5aQ0M1aEQ3NGR5elVaLVloeVpWY1AxUSIsImF1dGhfdGltZSI6MTY0ODE1MzMzMSwic2Vzc2lvbl9zdGF0ZSI6IjI5ZmI5ZmE2LWEyZmQtNGFkZS1iMTNhLWIyOGFhYTBkZjY4OCIsImFjciI6IjAiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.h50QhHXGYRO9mQJRIPosr3Q2TheaMZbN9kdI2Q3ZnM9mZY54SmklyCz3dLdeipfrOrl1DFVIZnMnVGGnz-asK8l4xkREvRe1DNMNezUEQ_JfJlebbGWH72hzOnaHO31jg7xVvDes5xIf7mk1B9MSaFef8uFRkgFYzUNxGOkrOXCg8Id8vlk3Tr5-_rA9eXlqjJ7TXXtBoJ5sPYWX9wV1qLDWydPTYJJ8YOeHqK8QS8ysLAxm2v2tlW8LKGBBsgFITA_KNW1witOrmGyoITv4-hnGLhDQFnfeNiK2BexPsDwh13VSKZQk6TFuwKJpBMuMCEi6wcMUE7xF0pTWRbHGxQ")
                .asString();

       // System.out.println(response.getBody().toString());
    }

    @Test
    public void d_token() {
        HttpResponse<String> response = Unirest.get("https://hub.knime.com/_/token")
                .header("cookie", "_ga=GA1.2.621586728.1648146691; _gid=GA1.2.1600765859.1648146691; _gcl_au=1.1.415446802.1648153161; _hjSessionUser_1995641=eyJpZCI6ImRkYzllZmFmLTFkZjItNWY3Mi1iMTdhLWU1YzBhYzk0NTFmNCIsImNyZWF0ZWQiOjE2NDgxNTMxNjEwNzcsImV4aXN0aW5nIjpmYWxzZX0=; _gat_UA-511689-4=1; knime-hub-sid=s%3AWGJ-HGfDMOyglBrkpWcd-nC7anaDvDLf.GunVc%2FZG3wfirqOB%2BrmiJm5GnbvAWgs%2B8TFURlX5QZw; knime_hub_auth=eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiI4MDM4ZjM2YS0wNmM2LTRhZGMtYmYwMy0zNjZjYmM0ZGZhODUiLCJleHAiOjE2NDgxNjgwMDQsIm5iZiI6MCwiaWF0IjoxNjQ4MTU3MjA0LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiNU9ZcEVjVHRrX2F2NlkzcGZVYmNKeEpnV01PckVZV3U0dDR5RGZLSjFWWSIsImF1dGhfdGltZSI6MTY0ODE1NzIwNCwic2Vzc2lvbl9zdGF0ZSI6IjM1OTgwYjFhLTE0ZTktNGNlYS1iYzM5LThjN2M0NTdhYjRmYSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.t6HGj_e6O-lq2PteRMqe_zoQCG85wSjiSL7AGTVULLZdgE6Kk8IAeDCfQLzDcGtcA3QapZyt7YdHZyWqTEG8uzm_fM7vJXE0Ntw6wJ3z0W0XqJ7MVi9lWgHdQSJPoip6zOZt0BMaLkGZn7q-ruQXNhaFwmKksMxS7iTdiQeW-aTvpE6bmAT5qBc6yhw4fJE4EEPVgfYyQHFuYQZD9FaSh5eGjwAhlWlZqoq33HDp9PP8O0utTiMcaOF4DQ4nyL4jccOmhe8wDoxyymvf9Hm0VKhs5rLKL-V3d6lshpjxCtx1BFK8PTMOXlFqa2cPmCifhOEWxSc-e4Jb1UuGeRIlHw; knime-hub-sid=s%3ATX5LjT8trb4fXDgJjb2nSubqu5lgVvqL.%2BT7%2B8CemEUGmj0WxaZmDa%2FgBlwMi0ruJI5PRNbkqdkw")
                .asString();

        String access_token = response.getBody().toString();
        //System.out.println(response.getBody().toString());
        Assert.assertEquals(response.getStatus(), 200);
    }
    @Test
    public void e_createSpace() {
        HttpResponse<String> response = Unirest.put("https://api.hub.knime.com/repository/Users/jchacha/TestoiNew?overwrite=false")
                .header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiJjNGFmZGI4YS1jMDRmLTRhOTEtYWM2NC1iZTM1NmQ1NDA1YzUiLCJleHAiOjE2NDgxNjQxOTYsIm5iZiI6MCwiaWF0IjoxNjQ4MTUzMzk2LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiSk04eUFrWUI3dmNSMHk1b2ZmdE5aQ0M1aEQ3NGR5elVaLVloeVpWY1AxUSIsImF1dGhfdGltZSI6MTY0ODE1MzMzMSwic2Vzc2lvbl9zdGF0ZSI6IjI5ZmI5ZmE2LWEyZmQtNGFkZS1iMTNhLWIyOGFhYTBkZjY4OCIsImFjciI6IjAiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.h50QhHXGYRO9mQJRIPosr3Q2TheaMZbN9kdI2Q3ZnM9mZY54SmklyCz3dLdeipfrOrl1DFVIZnMnVGGnz-asK8l4xkREvRe1DNMNezUEQ_JfJlebbGWH72hzOnaHO31jg7xVvDes5xIf7mk1B9MSaFef8uFRkgFYzUNxGOkrOXCg8Id8vlk3Tr5-_rA9eXlqjJ7TXXtBoJ5sPYWX9wV1qLDWydPTYJJ8YOeHqK8QS8ysLAxm2v2tlW8LKGBBsgFITA_KNW1witOrmGyoITv4-hnGLhDQFnfeNiK2BexPsDwh13VSKZQk6TFuwKJpBMuMCEi6wcMUE7xF0pTWRbHGxQ")
                .header("Cookie", "_ga=GA1.2.621586728.1648146691; _gid=GA1.2.1600765859.1648146691; _gcl_au=1.1.415446802.1648153161; _hjSessionUser_1995641=eyJpZCI6ImRkYzllZmFmLTFkZjItNWY3Mi1iMTdhLWU1YzBhYzk0NTFmNCIsImNyZWF0ZWQiOjE2NDgxNTMxNjEwNzcsImV4aXN0aW5nIjpmYWxzZX0=; knime-hub-sid=s%3AGj5464JDwJnXxvc-ndyHnkq0WoZKVt-X.QMRyojtwj2CKZ2ziFvkuwoYLCwC6I8rWD8Csztk%2F5LM; knime_hub_auth=eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiJjNGFmZGI4YS1jMDRmLTRhOTEtYWM2NC1iZTM1NmQ1NDA1YzUiLCJleHAiOjE2NDgxNjQxOTYsIm5iZiI6MCwiaWF0IjoxNjQ4MTUzMzk2LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiSk04eUFrWUI3dmNSMHk1b2ZmdE5aQ0M1aEQ3NGR5elVaLVloeVpWY1AxUSIsImF1dGhfdGltZSI6MTY0ODE1MzMzMSwic2Vzc2lvbl9zdGF0ZSI6IjI5ZmI5ZmE2LWEyZmQtNGFkZS1iMTNhLWIyOGFhYTBkZjY4OCIsImFjciI6IjAiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.h50QhHXGYRO9mQJRIPosr3Q2TheaMZbN9kdI2Q3ZnM9mZY54SmklyCz3dLdeipfrOrl1DFVIZnMnVGGnz-asK8l4xkREvRe1DNMNezUEQ_JfJlebbGWH72hzOnaHO31jg7xVvDes5xIf7mk1B9MSaFef8uFRkgFYzUNxGOkrOXCg8Id8vlk3Tr5-_rA9eXlqjJ7TXXtBoJ5sPYWX9wV1qLDWydPTYJJ8YOeHqK8QS8ysLAxm2v2tlW8LKGBBsgFITA_KNW1witOrmGyoITv4-hnGLhDQFnfeNiK2BexPsDwh13VSKZQk6TFuwKJpBMuMCEi6wcMUE7xF0pTWRbHGxQ; _gat_UA-511689-4=1; knime-hub-sid=s%3ATX5LjT8trb4fXDgJjb2nSubqu5lgVvqL.%2BT7%2B8CemEUGmj0WxaZmDa%2FgBlwMi0ruJI5PRNbkqdkw")
                .header("Content-Type", "text/plain")
                .body("{\"private\":false,\"type\":\"Space\"}")
                        .asString();

//        System.out.println(jsonResponse .getBody().toString());
       // Assert.assertEquals(jsonResponse .getStatus(), 201);
        Assert.assertEquals( response.getStatus(), 201);
        System.out.println("Created Successfully!!!");
    }
    @Test
    public void f_deleteSpace() {
        HttpResponse<String> response = Unirest.delete("https://api.hub.knime.com/repository//Users/jchacha/TestoiNew")
                .header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiJjNGFmZGI4YS1jMDRmLTRhOTEtYWM2NC1iZTM1NmQ1NDA1YzUiLCJleHAiOjE2NDgxNjQxOTYsIm5iZiI6MCwiaWF0IjoxNjQ4MTUzMzk2LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiSk04eUFrWUI3dmNSMHk1b2ZmdE5aQ0M1aEQ3NGR5elVaLVloeVpWY1AxUSIsImF1dGhfdGltZSI6MTY0ODE1MzMzMSwic2Vzc2lvbl9zdGF0ZSI6IjI5ZmI5ZmE2LWEyZmQtNGFkZS1iMTNhLWIyOGFhYTBkZjY4OCIsImFjciI6IjAiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.h50QhHXGYRO9mQJRIPosr3Q2TheaMZbN9kdI2Q3ZnM9mZY54SmklyCz3dLdeipfrOrl1DFVIZnMnVGGnz-asK8l4xkREvRe1DNMNezUEQ_JfJlebbGWH72hzOnaHO31jg7xVvDes5xIf7mk1B9MSaFef8uFRkgFYzUNxGOkrOXCg8Id8vlk3Tr5-_rA9eXlqjJ7TXXtBoJ5sPYWX9wV1qLDWydPTYJJ8YOeHqK8QS8ysLAxm2v2tlW8LKGBBsgFITA_KNW1witOrmGyoITv4-hnGLhDQFnfeNiK2BexPsDwh13VSKZQk6TFuwKJpBMuMCEi6wcMUE7xF0pTWRbHGxQ")
                .header("Cookie", "_ga=GA1.2.621586728.1648146691; _gid=GA1.2.1600765859.1648146691; _gcl_au=1.1.415446802.1648153161; _hjSessionUser_1995641=eyJpZCI6ImRkYzllZmFmLTFkZjItNWY3Mi1iMTdhLWU1YzBhYzk0NTFmNCIsImNyZWF0ZWQiOjE2NDgxNTMxNjEwNzcsImV4aXN0aW5nIjpmYWxzZX0=; knime-hub-sid=s%3AGj5464JDwJnXxvc-ndyHnkq0WoZKVt-X.QMRyojtwj2CKZ2ziFvkuwoYLCwC6I8rWD8Csztk%2F5LM; knime_hub_auth=eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ2SHpuYUhTS3RMWmszcnczVlJBN2M4eThsUHlVazU3YndMejRvekFZT1o4In0.eyJqdGkiOiJjNGFmZGI4YS1jMDRmLTRhOTEtYWM2NC1iZTM1NmQ1NDA1YzUiLCJleHAiOjE2NDgxNjQxOTYsIm5iZiI6MCwiaWF0IjoxNjQ4MTUzMzk2LCJpc3MiOiJodHRwczovL2F1dGguaHViLmtuaW1lLmNvbS9hdXRoL3JlYWxtcy9rbmltZSIsInN1YiI6IjRiNjJlMDM0LTdkMWItNDhiMC1iYzE5LTdiNTZmNTE2Y2MxOCIsInR5cCI6IkJlYXJlciIsImF6cCI6Imh1Yi11aSIsIm5vbmNlIjoiSk04eUFrWUI3dmNSMHk1b2ZmdE5aQ0M1aEQ3NGR5elVaLVloeVpWY1AxUSIsImF1dGhfdGltZSI6MTY0ODE1MzMzMSwic2Vzc2lvbl9zdGF0ZSI6IjI5ZmI5ZmE2LWEyZmQtNGFkZS1iMTNhLWIyOGFhYTBkZjY4OCIsImFjciI6IjAiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cHM6Ly9zdGFnZS5odWIua25pbWUuY29tIiwiaHR0cHM6Ly9odWIua25pbWUuY29tIl0sInJlc291cmNlX2FjY2VzcyI6eyJicm9rZXIiOnsicm9sZXMiOlsicmVhZC10b2tlbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZ3JvdXBzIHJvbGVzIGVtYWlsIHByb2ZpbGUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwibmFtZSI6IkpDaGFjaGEiLCJncm91cHMiOlsiaHVidXNlciJdLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJqY2hhY2hhIiwiZ2l2ZW5fbmFtZSI6IkpDaGFjaGEiLCJlbWFpbCI6ImphY2tsaW5lLmJva2VAZ21haWwuY29tIn0.h50QhHXGYRO9mQJRIPosr3Q2TheaMZbN9kdI2Q3ZnM9mZY54SmklyCz3dLdeipfrOrl1DFVIZnMnVGGnz-asK8l4xkREvRe1DNMNezUEQ_JfJlebbGWH72hzOnaHO31jg7xVvDes5xIf7mk1B9MSaFef8uFRkgFYzUNxGOkrOXCg8Id8vlk3Tr5-_rA9eXlqjJ7TXXtBoJ5sPYWX9wV1qLDWydPTYJJ8YOeHqK8QS8ysLAxm2v2tlW8LKGBBsgFITA_KNW1witOrmGyoITv4-hnGLhDQFnfeNiK2BexPsDwh13VSKZQk6TFuwKJpBMuMCEi6wcMUE7xF0pTWRbHGxQ; knime-hub-sid=s%3ATX5LjT8trb4fXDgJjb2nSubqu5lgVvqL.%2BT7%2B8CemEUGmj0WxaZmDa%2FgBlwMi0ruJI5PRNbkqdkw")
                .asString();

       // System.out.println(response.getBody().toString());
         Assert.assertEquals(response.getStatus(), 204);
    // response = (HttpResponse<String>) Unirest.delete("https://api.hub.knime.com/repository//Users/jchacha/New%20space?details=aggregated&spaceDetails=true");
    //    Assert.assertNotEquals(response.getStatus(), 200);
        System.out.println("Deleted Successfully!!!");
    }
}
