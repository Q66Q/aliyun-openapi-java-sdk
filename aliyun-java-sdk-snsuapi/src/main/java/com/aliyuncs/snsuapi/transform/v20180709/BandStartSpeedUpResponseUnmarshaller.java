/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.snsuapi.transform.v20180709;

import com.aliyuncs.snsuapi.model.v20180709.BandStartSpeedUpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BandStartSpeedUpResponseUnmarshaller {

	public static BandStartSpeedUpResponse unmarshall(BandStartSpeedUpResponse bandStartSpeedUpResponse, UnmarshallerContext context) {
		
		bandStartSpeedUpResponse.setRequestId(context.stringValue("BandStartSpeedUpResponse.RequestId"));
		bandStartSpeedUpResponse.setResultCode(context.stringValue("BandStartSpeedUpResponse.ResultCode"));
		bandStartSpeedUpResponse.setResultMessage(context.stringValue("BandStartSpeedUpResponse.ResultMessage"));
		bandStartSpeedUpResponse.setResultModule(context.booleanValue("BandStartSpeedUpResponse.ResultModule"));
	 
	 	return bandStartSpeedUpResponse;
	}
}