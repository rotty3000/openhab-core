/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.transform;

/**
 * A TransformationProcessor transforms a given input and returns the transformed
 * result. Transformations could make sense in various situations, for example:
 * <ul>
 * <li>extract certain informations from a weather forecast website</li>
 * <li>extract the status of your TV which provides it's status on a webpage</li>
 * <li>postprocess the output from a serial device to be human readable</li>
 * </ul>
 * One could provide his own processors by providing a new implementation of this
 * Interface.
 *
 * @author Thomas Eichstaedt-Engelen - Initial contribution
 * @author Kai Kreuzer - Initial contribution
 */
public interface TransformationService {

    /**
     * Transforms the input <code>source</code> by means of the given <code>function</code>
     * and returns the transformed output. If the transformation couldn't be completed
     * for any reason, one should return the unchanged <code>source</code>. This
     * method should never return <code>null</code>. In case of any error an
     * {@link TransformationException} should be thrown.
     *
     * @param function the function to be used to transform the input
     * @param source the input to be transformed
     * @return the transformed result or the unchanged <code>source</code> if the
     *         transformation couldn't be completed for any reason.
     * @throws TransformationException if any error occurs
     */
    String transform(String function, String source) throws TransformationException;

}
