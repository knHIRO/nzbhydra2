/*
 *  (C) Copyright 2017 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
angular
    .module('nzbhydraApp')
    .factory('GenericStorageService', GenericStorageService);

function GenericStorageService($http) {

    return {
        get: get,
        put: put
    };

    function get(key, forUser) {
        return $http.get("internalapi/genericstorage/" + key, {params: {forUser: forUser}, ignoreLoadingBar: true});
    }

    function put(key, forUser, value) {
        return $http.put("internalapi/genericstorage/" + key, value, {params: {forUser: forUser}, ignoreLoadingBar: true});
    }


}