/* 
 * Blockchain Proof
 *
 * <b>With the Blockchain Proof API it is easy to prove or disprove existence of (binary) data at a certain point in time. Behind the scenes it stores entries using the Factom (bitcoin), Multichain or Ethereum blockchain by means of our generic blockchain API.</b>    The flow is generally as follows:  1. Make sure a configuration is present  2. Register content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing  3. Verify content by uploading a file, some content, or providing a Stream Location from the Storage API. When you upload content you have to tell the API whether the data has already been hashed or not. If not, or when uploading a file or stream location, the API will take care of the hashing. You will get back whether the content has been registered previously or not      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.9
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Sphereon.SDK.Blockchain.Proof.Client;
using Sphereon.SDK.Blockchain.Proof.Model;

namespace Sphereon.SDK.Blockchain.Proof.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRegistrationApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Register content
        /// </summary>
        /// <remarks>
        /// Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="existence">Register content using the current settings</param>
        /// <returns>RegisterContentResponse</returns>
        RegisterContentResponse RegisterUsingContent (string configName, ContentRequest existence);

        /// <summary>
        /// Register content
        /// </summary>
        /// <remarks>
        /// Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="existence">Register content using the current settings</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        ApiResponse<RegisterContentResponse> RegisterUsingContentWithHttpInfo (string configName, ContentRequest existence);
        /// <summary>
        /// Register hash using the Storage API
        /// </summary>
        /// <remarks>
        /// Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="streamLocations">The stream locations on storage</param>
        /// <returns>RegisterContentResponse</returns>
        RegisterContentResponse RegisterUsingLocation (string configName, List<StreamLocation> streamLocations);

        /// <summary>
        /// Register hash using the Storage API
        /// </summary>
        /// <remarks>
        /// Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="streamLocations">The stream locations on storage</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        ApiResponse<RegisterContentResponse> RegisterUsingLocationWithHttpInfo (string configName, List<StreamLocation> streamLocations);
        /// <summary>
        /// Register bytestream/file hash
        /// </summary>
        /// <remarks>
        /// Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="stream">The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored</param>
        /// <param name="fileName">Optional input file name. (optional)</param>
        /// <returns>RegisterContentResponse</returns>
        RegisterContentResponse RegisterUsingStream (string configName, System.IO.Stream stream, string fileName = null);

        /// <summary>
        /// Register bytestream/file hash
        /// </summary>
        /// <remarks>
        /// Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </remarks>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="stream">The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored</param>
        /// <param name="fileName">Optional input file name. (optional)</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        ApiResponse<RegisterContentResponse> RegisterUsingStreamWithHttpInfo (string configName, System.IO.Stream stream, string fileName = null);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class RegistrationApi : IRegistrationApi
    {
        private Sphereon.SDK.Blockchain.Proof.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="RegistrationApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RegistrationApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = Sphereon.SDK.Blockchain.Proof.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RegistrationApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RegistrationApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Sphereon.SDK.Blockchain.Proof.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Sphereon.SDK.Blockchain.Proof.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Register content Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="existence">Register content using the current settings</param>
        /// <returns>RegisterContentResponse</returns>
        public RegisterContentResponse RegisterUsingContent (string configName, ContentRequest existence)
        {
             ApiResponse<RegisterContentResponse> localVarResponse = RegisterUsingContentWithHttpInfo(configName, existence);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Register content Register content. Please provide the content in the request. You also have to provide whether you have hashed the content yourself, or whether is should be done on the server side
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="existence">Register content using the current settings</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        public ApiResponse< RegisterContentResponse > RegisterUsingContentWithHttpInfo (string configName, ContentRequest existence)
        {
            // verify the required parameter 'configName' is set
            if (configName == null)
                throw new ApiException(400, "Missing required parameter 'configName' when calling RegistrationApi->RegisterUsingContent");
            // verify the required parameter 'existence' is set
            if (existence == null)
                throw new ApiException(400, "Missing required parameter 'existence' when calling RegistrationApi->RegisterUsingContent");

            var localVarPath = "/existence/{configName}/content";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (configName != null) localVarPathParams.Add("configName", Configuration.ApiClient.ParameterToString(configName)); // path parameter
            if (existence != null && existence.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(existence); // http body (model) parameter
            }
            else
            {
                localVarPostBody = existence; // byte array
            }

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RegisterUsingContent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<RegisterContentResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (RegisterContentResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(RegisterContentResponse)));
        }

        /// <summary>
        /// Register hash using the Storage API Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="streamLocations">The stream locations on storage</param>
        /// <returns>RegisterContentResponse</returns>
        public RegisterContentResponse RegisterUsingLocation (string configName, List<StreamLocation> streamLocations)
        {
             ApiResponse<RegisterContentResponse> localVarResponse = RegisterUsingLocationWithHttpInfo(configName, streamLocations);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Register hash using the Storage API Register a hash of file/blob by supplying a Stream location of the Storage API. This Stream Location maps to a location of a file/blob on some remote cloud storage. Hashing will be done on the server side Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="streamLocations">The stream locations on storage</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        public ApiResponse< RegisterContentResponse > RegisterUsingLocationWithHttpInfo (string configName, List<StreamLocation> streamLocations)
        {
            // verify the required parameter 'configName' is set
            if (configName == null)
                throw new ApiException(400, "Missing required parameter 'configName' when calling RegistrationApi->RegisterUsingLocation");
            // verify the required parameter 'streamLocations' is set
            if (streamLocations == null)
                throw new ApiException(400, "Missing required parameter 'streamLocations' when calling RegistrationApi->RegisterUsingLocation");

            var localVarPath = "/existence/{configName}/streams/location";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (configName != null) localVarPathParams.Add("configName", Configuration.ApiClient.ParameterToString(configName)); // path parameter
            if (streamLocations != null && streamLocations.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(streamLocations); // http body (model) parameter
            }
            else
            {
                localVarPostBody = streamLocations; // byte array
            }

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RegisterUsingLocation", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<RegisterContentResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (RegisterContentResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(RegisterContentResponse)));
        }

        /// <summary>
        /// Register bytestream/file hash Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="stream">The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored</param>
        /// <param name="fileName">Optional input file name. (optional)</param>
        /// <returns>RegisterContentResponse</returns>
        public RegisterContentResponse RegisterUsingStream (string configName, System.IO.Stream stream, string fileName = null)
        {
             ApiResponse<RegisterContentResponse> localVarResponse = RegisterUsingStreamWithHttpInfo(configName, stream, fileName);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Register bytestream/file hash Register a hash of content by supplying a file or some other binary data. Hashing will be done on the server side. Please note that the binary data itself will not be stored, only the hash. Use the registerUsingContent endpoint if you&#39;d like to store content
        /// </summary>
        /// <exception cref="Sphereon.SDK.Blockchain.Proof.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="configName">The configuration name this operation</param>
        /// <param name="stream">The binary data (not hashed). Hashing will be done on the server side. The binary data will not be stored</param>
        /// <param name="fileName">Optional input file name. (optional)</param>
        /// <returns>ApiResponse of RegisterContentResponse</returns>
        public ApiResponse< RegisterContentResponse > RegisterUsingStreamWithHttpInfo (string configName, System.IO.Stream stream, string fileName = null)
        {
            // verify the required parameter 'configName' is set
            if (configName == null)
                throw new ApiException(400, "Missing required parameter 'configName' when calling RegistrationApi->RegisterUsingStream");
            // verify the required parameter 'stream' is set
            if (stream == null)
                throw new ApiException(400, "Missing required parameter 'stream' when calling RegistrationApi->RegisterUsingStream");

            var localVarPath = "/existence/{configName}/streams/multipart";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "multipart/form-data"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json;charset=UTF-8"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (configName != null) localVarPathParams.Add("configName", Configuration.ApiClient.ParameterToString(configName)); // path parameter
            if (fileName != null) localVarQueryParams.Add("fileName", Configuration.ApiClient.ParameterToString(fileName)); // query parameter
            if (stream != null) localVarFileParams.Add("stream", Configuration.ApiClient.ParameterToFile("stream", stream));

            // authentication (oauth2schema) required
            // oauth required
            if (!String.IsNullOrEmpty(Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RegisterUsingStream", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<RegisterContentResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (RegisterContentResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(RegisterContentResponse)));
        }

    }
}
