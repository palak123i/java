/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CSIDriverSpec is the specification of a CSIDriver.
 */
@ApiModel(description = "CSIDriverSpec is the specification of a CSIDriver.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-17T11:16:41.964Z[Etc/UTC]")
public class V1beta1CSIDriverSpec {
  public static final String SERIALIZED_NAME_ATTACH_REQUIRED = "attachRequired";
  @SerializedName(SERIALIZED_NAME_ATTACH_REQUIRED)
  private Boolean attachRequired;

  public static final String SERIALIZED_NAME_POD_INFO_ON_MOUNT = "podInfoOnMount";
  @SerializedName(SERIALIZED_NAME_POD_INFO_ON_MOUNT)
  private Boolean podInfoOnMount;

  public static final String SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES = "volumeLifecycleModes";
  @SerializedName(SERIALIZED_NAME_VOLUME_LIFECYCLE_MODES)
  private List<String> volumeLifecycleModes = null;


  public V1beta1CSIDriverSpec attachRequired(Boolean attachRequired) {
    
    this.attachRequired = attachRequired;
    return this;
  }

   /**
   * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
   * @return attachRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.")

  public Boolean getAttachRequired() {
    return attachRequired;
  }


  public void setAttachRequired(Boolean attachRequired) {
    this.attachRequired = attachRequired;
  }


  public V1beta1CSIDriverSpec podInfoOnMount(Boolean podInfoOnMount) {
    
    this.podInfoOnMount = podInfoOnMount;
    return this;
  }

   /**
   * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. \&quot;csi.storage.k8s.io/pod.name\&quot;: pod.Name \&quot;csi.storage.k8s.io/pod.namespace\&quot;: pod.Namespace \&quot;csi.storage.k8s.io/pod.uid\&quot;: string(pod.UID) \&quot;csi.storage.k8s.io/ephemeral\&quot;: \&quot;true\&quot; iff the volume is an ephemeral inline volume                                 defined by a CSIVolumeSource, otherwise \&quot;false\&quot;  \&quot;csi.storage.k8s.io/ephemeral\&quot; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the \&quot;Persistent\&quot; and \&quot;Ephemeral\&quot; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
   * @return podInfoOnMount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. \"csi.storage.k8s.io/pod.name\": pod.Name \"csi.storage.k8s.io/pod.namespace\": pod.Namespace \"csi.storage.k8s.io/pod.uid\": string(pod.UID) \"csi.storage.k8s.io/ephemeral\": \"true\" iff the volume is an ephemeral inline volume                                 defined by a CSIVolumeSource, otherwise \"false\"  \"csi.storage.k8s.io/ephemeral\" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the \"Persistent\" and \"Ephemeral\" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.")

  public Boolean getPodInfoOnMount() {
    return podInfoOnMount;
  }


  public void setPodInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
  }


  public V1beta1CSIDriverSpec volumeLifecycleModes(List<String> volumeLifecycleModes) {
    
    this.volumeLifecycleModes = volumeLifecycleModes;
    return this;
  }

  public V1beta1CSIDriverSpec addVolumeLifecycleModesItem(String volumeLifecycleModesItem) {
    if (this.volumeLifecycleModes == null) {
      this.volumeLifecycleModes = new ArrayList<String>();
    }
    this.volumeLifecycleModes.add(volumeLifecycleModesItem);
    return this;
  }

   /**
   * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is \&quot;Persistent\&quot;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is \&quot;Ephemeral\&quot;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
   * @return volumeLifecycleModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is \"Persistent\", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is \"Ephemeral\". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.")

  public List<String> getVolumeLifecycleModes() {
    return volumeLifecycleModes;
  }


  public void setVolumeLifecycleModes(List<String> volumeLifecycleModes) {
    this.volumeLifecycleModes = volumeLifecycleModes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CSIDriverSpec v1beta1CSIDriverSpec = (V1beta1CSIDriverSpec) o;
    return Objects.equals(this.attachRequired, v1beta1CSIDriverSpec.attachRequired) &&
        Objects.equals(this.podInfoOnMount, v1beta1CSIDriverSpec.podInfoOnMount) &&
        Objects.equals(this.volumeLifecycleModes, v1beta1CSIDriverSpec.volumeLifecycleModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachRequired, podInfoOnMount, volumeLifecycleModes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CSIDriverSpec {\n");
    sb.append("    attachRequired: ").append(toIndentedString(attachRequired)).append("\n");
    sb.append("    podInfoOnMount: ").append(toIndentedString(podInfoOnMount)).append("\n");
    sb.append("    volumeLifecycleModes: ").append(toIndentedString(volumeLifecycleModes)).append("\n");
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

