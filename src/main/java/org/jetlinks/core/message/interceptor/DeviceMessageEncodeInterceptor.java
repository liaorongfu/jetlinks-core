package org.jetlinks.core.message.interceptor;

import org.jetlinks.core.message.codec.EncodedMessage;
import org.jetlinks.core.message.codec.MessageEncodeContext;
import org.jetlinks.core.message.codec.Transport;

/**
 * 设备消息解码拦截器,用于在对消息进行编码时进行自定义处理
 *
 * @see org.jetlinks.core.message.codec.DeviceMessageCodec#encode(Transport, MessageEncodeContext)
 * @see MessageEncodeContext
 * @see org.jetlinks.core.message.codec.DefaultDeviceMessageCodec
 */
public interface DeviceMessageEncodeInterceptor extends DeviceMessageCodecInterceptor {

    /**
     * 编码前执行
     *
     * @param context 编码上下文
     */
    void preEncode(MessageEncodeContext context);

    /**
     * 编码后执行
     *
     * @param context 编码上下文
     * @param message 已编码的消息
     * @return 新的消息
     */
    EncodedMessage postEncode(MessageEncodeContext context, EncodedMessage message);

}
