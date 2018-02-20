package com.devsupport.payu;

public class MerchantConfig {
  public String id() {return  "{{it.merchantid}}";}
  public String key() {return "{{it.merchantkey}}";}
  public String newHashUrl() {return "{{it.newhash}}";}
  public String resUrl() {return "{{it.responsehash}}";}
  public Boolean prod() {return false;}
  public Boolean sandbox() {return true;}
}