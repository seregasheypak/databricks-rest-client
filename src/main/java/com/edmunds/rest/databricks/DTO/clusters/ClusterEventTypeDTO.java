/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.DTO.clusters;

import java.io.Serializable;

/**
 * Cluster Event DTO object. See below link.
 *
 * @see <a href="https://docs.databricks.com/api/latest/clusters.html#clustereventsclustereventtype">https://docs.databricks.com/api/latest/clusters.html#clustereventsclustereventtype</a>
 */
public enum ClusterEventTypeDTO implements Serializable {
  CREATING("CREATING"),
  DID_NOT_EXPAND_DISK("DID_NOT_EXPAND_DISK"),
  EXPANDED_DISK("EXPANDED_DISK"),
  FAILED_TO_EXPAND_DISK("FAILED_TO_EXPAND_DISK"),
  INIT_SCRIPTS_STARTING("INIT_SCRIPTS_STARTING"),
  INIT_SCRIPTS_FINISHED("INIT_SCRIPTS_FINISHED"),
  STARTING("STARTING"),
  RESTARTING("RESTARTING"),
  TERMINATING("TERMINATING"),
  EDITED("EDITED"),
  RUNNING("RUNNING"),
  RESIZING("RESIZING"),
  UPSIZE_COMPLETED("UPSIZE_COMPLETED"),
  NODES_LOST("NODES_LOST"),
  DRIVER_HEALTHY("DRIVER_HEALTHY"),
  DRIVER_UNAVAILABLE("DRIVER_UNAVAILABLE"),
  SPARK_EXCEPTION("SPARK_EXCEPTION"),
  DRIVER_NOT_RESPONDING("DRIVER_NOT_RESPONDING"),
  DBFS_DOWN("DBFS_DOWN"),
  METASTORE_DOWN("METASTORE_DOWN"),
  AUTOSCALING_STATS_REPORT("AUTOSCALING_STATS_REPORT"),
  NODE_BLACKLISTED("NODE_BLACKLISTED"),
  PINNED("PINNED"),
  UNPINNED("UNPINNED");

  private String value;

  ClusterEventTypeDTO(String value) {
    this.value = value;
  }

  public String toString() {
    return this.value;
  }
}
