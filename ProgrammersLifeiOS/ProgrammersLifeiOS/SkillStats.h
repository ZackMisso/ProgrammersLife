//
//  SkillStats.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Skill.h"

typedef Skill* SkillSet[10];

@interface SkillStats : NSObject{
    SkillSet skills;
}

-(void)initialize;

@end
