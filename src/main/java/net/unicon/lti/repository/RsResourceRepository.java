/**
 * Copyright 2021 Unicon (R)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.unicon.lti.repository;

import net.unicon.lti.model.LtiContextEntity;
import net.unicon.lti.model.LtiMembershipEntity;
import net.unicon.lti.model.LtiUserEntity;
import net.unicon.lti.model.resourcesearch.RsResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface RsResourceRepository extends JpaRepository<RsResourceEntity, Long> {

    RsResourceEntity findById(long id);

    RsResourceEntity findByName(String name);

    List<RsResourceEntity> findByPublisher(String publisher);

    List<RsResourceEntity> findBySubjectIdentifier(long subjectIdentifier);

}
