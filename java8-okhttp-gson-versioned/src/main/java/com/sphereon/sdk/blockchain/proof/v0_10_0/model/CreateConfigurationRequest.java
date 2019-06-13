/*
 * Blockchain Proof
 * With the Blockchain Proof API it is easy to prove or disprove existence of data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not    Full API Documentation: https://docs.sphereon.com/api/blockchain-proof/0.10/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.10
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.blockchain.proof.v0_10_0.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sphereon.sdk.blockchain.proof.v0_10_0.model.ChainSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Create a context configuration
 */
@ApiModel(description = "Create a context configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T05:09:00.320+02:00")
public class CreateConfigurationRequest {
  @SerializedName("initialSettings")
  private ChainSettings initialSettings = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The access mode for this configuration. Public means accessible to other tenants of the API as well. Currently public is only allowed for Sphereon itself
   */
  @JsonAdapter(AccessModeEnum.Adapter.class)
  public enum AccessModeEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE");

    private String value;

    AccessModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessModeEnum fromValue(String text) {
      for (AccessModeEnum b : AccessModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessMode")
  private AccessModeEnum accessMode = null;

  public CreateConfigurationRequest initialSettings(ChainSettings initialSettings) {
    this.initialSettings = initialSettings;
    return this;
  }

   /**
   * The initial context settings.
   * @return initialSettings
  **/
  @ApiModelProperty(required = true, value = "The initial context settings.")
  public ChainSettings getInitialSettings() {
    return initialSettings;
  }

  public void setInitialSettings(ChainSettings initialSettings) {
    this.initialSettings = initialSettings;
  }

  public CreateConfigurationRequest context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The Easy Blockchain API context. This has to be a context you created or a public context
   * @return context
  **/
  @ApiModelProperty(required = true, value = "The Easy Blockchain API context. This has to be a context you created or a public context")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public CreateConfigurationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The configuration name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The configuration name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateConfigurationRequest accessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
    return this;
  }

   /**
   * The access mode for this configuration. Public means accessible to other tenants of the API as well. Currently public is only allowed for Sphereon itself
   * @return accessMode
  **/
  @ApiModelProperty(required = true, value = "The access mode for this configuration. Public means accessible to other tenants of the API as well. Currently public is only allowed for Sphereon itself")
  public AccessModeEnum getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(AccessModeEnum accessMode) {
    this.accessMode = accessMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigurationRequest createConfigurationRequest = (CreateConfigurationRequest) o;
    return Objects.equals(this.initialSettings, createConfigurationRequest.initialSettings) &&
        Objects.equals(this.context, createConfigurationRequest.context) &&
        Objects.equals(this.name, createConfigurationRequest.name) &&
        Objects.equals(this.accessMode, createConfigurationRequest.accessMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialSettings, context, name, accessMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfigurationRequest {\n");
    
    sb.append("    initialSettings: ").append(toIndentedString(initialSettings)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
